package book;
import java.io.*;
import java.net.*;

public class TcpServer {
	public static void main(String args[]) throws IOException {
		ServerSocket svrsoc = null;
		Socket soc = null;
		InputStream is = null;
		OutputStream os = null;
		//DataInputStream in = null;
		BufferedReader in = null;
		PrintStream out = null;
		try {
			svrsoc = new ServerSocket(8000);
			soc = svrsoc.accept();
			is = soc.getInputStream();
			//in = new DataInputStream(is);
			in = new BufferedReader(new InputStreamReader(is));
			os = soc.getOutputStream();
			out = new PrintStream(os);
			InetAddress clientIP = soc.getInetAddress();
			System.out.println("Client's IP address:" + clientIP);
			int port;
			port = soc.getPort();
			System.out.println("Client's port:" + port);
			out.println("Welcome! ...");
			String str = in.readLine();
			while(! str.equals("quit")) {
				System.out.println("Cloent said:"+str);
				str = in.readLine();
			}
			System.out.println("Cloent want to leave.");
		}
		catch (Exception e) {
			System.out.println("Error:" + e);
		}
		
		finally {
			is.close();
			os.close();
			soc.close();
			System.exit(0);
		}
				
	}

}


