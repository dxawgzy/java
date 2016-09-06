package network;  //根据域名解析得到对应的IP
import java.net.*;

public class IPAddress2 {
	
	public static void main(String args[]) {
		try {
			InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
			for (int i = 0; i < addresses.length; i++) {
				System.out.println(addresses[i]);
			}
		}
		catch (UnknownHostException ex) {
			System.out.println("Could not find the address");
		}
	}

}


