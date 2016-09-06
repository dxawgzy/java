package book;  // P128  Java网络高级编程

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	ServletContext context;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		context = config.getServletContext();
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws 
	        ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("information about Servletconfig");
		out.println("<pre>");
		out.println();
		out.println("initial parameter name:"+getInitParameter("name"));
		Enumeration enume = context.getInitParameterNames();
		if(enume!=null) {
			boolean first = true;
			while(enume.hasMoreElements()) {
				if(first) {
					out.println("Init Parameters");
					first = false;
				}
				String param = (String)enume.nextElement();
				out.println("");
			}
		}
		
	}
	
}



