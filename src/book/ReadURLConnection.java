package book;  //P8 Java网络高级编程

import java.net.*;
import java.io.*;

public class ReadURLConnection {
	public static void main(String args[]) {
		try {
			URL cumtURL = new URL("http://www.baidu.com");
			URLConnection cumtConnection = cumtURL.openConnection();
			DataInputStream din = new DataInputStream(cumtConnection.getInputStream());
			String inputLine;
			while ((inputLine = din.readLine()) != null) {
				System.out.println(inputLine);
			}
			din.close();
		}
		catch (MalformedURLException me) {}
		catch (IOException ioe) {}
	}

}



