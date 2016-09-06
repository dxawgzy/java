package book;
import java.net.*;
import java.io.*;

public class TcpClient {
	public static void main(String args[]) throws IOException {
		Socket soc = null;
		InputStream is = null;
		OutputStream os = null;
		//DataInputStream in = null;
		BufferedReader in = null;
		PrintStream out = null;
		String strin = null;
		try{
			soc = new Socket("localhost", 8000);
			System.out.println("Connecting to the Server...");
			is = soc.getInputStream();
			os = soc.getOutputStream();
			//in = new DataInputStream(is);
			in = new BufferedReader(new InputStreamReader(is));
			out = new PrintStream(os);
			strin = in.readLine();
			System.out.println("Server said:" + strin);
			byte bmsg[] = new byte[20];
			System.in.read(bmsg);
			String msg = new String(bmsg, 0);
			msg = msg.trim();
			while(! msg.equals("quit")) {
				out.println(msg);
				System.in.read(bmsg);
				msg = new String(bmsg, 0);
				msg = msg.trim();
			}
			out.println(msg);
		}
		catch (Exception e) {
			System.out.println("Error:" + e);
		}
		
		finally{
			is.close();
			os.close();
			soc.close();
			System.exit(0);
		}
	}

}


