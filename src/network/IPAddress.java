package network;
import java.net.*;

public class IPAddress {
	
	public static void main(String args[]) {
		try {
			InetAddress address = InetAddress.getByName("www.baidu.com");
			//InetAddress address = InetAddress.getByName("61.135.169.121");
			System.out.println(address);
		}
		catch (UnknownHostException ex) {
			System.out.println("Could not find the address");
		}
	}

}
