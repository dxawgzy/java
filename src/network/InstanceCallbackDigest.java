package network;

import java.io.*;
import java.security.*;

public class InstanceCallbackDigest implements Runnable {
	
	private File input;
	private InstanceCallbackDigestUserInterface callback;
	
	public InstanceCallbackDigest(File input, 
			InstanceCallbackDigestUserInterface callback) {
		this.input = input;
		this.callback = callback;
	}
	
	public void run() {
		try {
			FileInputStream in = new FileInputStream(input);
			MessageDigest sha = MessageDigest.getInstance("SHA");
			DigestInputStream din = new DigestInputStream(in, sha);
			int b;
			while ((b = din.read()) != -1);
			din.close();
			byte[] digest = sha.digest();
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		catch (NoSuchAlgorithmException ex) {
			System.out.println(ex);
		}
	}

}


