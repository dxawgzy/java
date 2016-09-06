package book;  // P10
import java.net.*;
import java.io.*;

public class RequestURLConnection {
	public static void main(String args[]) {
		try {
			//String string_to_reverse = URLEncoder.encode(args[0]);
			String string_to_reverse = URLEncoder.encode(args[0], "UTF-8");
			URL exampleURL = new URL("http://java.sun.com/cgi-bin/backwards");
			URLConnection exampleConnection = exampleURL.openConnection();
			PrintStream dout = new PrintStream(
					new DataOutputStream(exampleConnection.getOutputStream()));
			dout.println("string=" + string_to_reverse);
			dout.close();
			//DataInputStream din = new DataInputStream(exampleConnection.getInputStream());
			InputStream is = exampleConnection.getInputStream();
			BufferedReader din = new BufferedReader(new InputStreamReader(is));
			String inputLine;
			while((inputLine = din.readLine()) != null) {
				System.out.println(inputLine);
			}
			din.close();
		}
		catch(MalformedURLException me) {
			System.err.println("MalformedURLException" + me);
		}
		catch(IOException ioe) {
			System.err.println("IOException" + ioe);
		}
	}

}



