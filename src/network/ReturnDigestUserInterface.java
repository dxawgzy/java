package network;  //P123

import java.io.*;

public class ReturnDigestUserInterface {
	public static void main(String args[]) {
		
		for (int i = 0; i < args.length; i++) {
			
			//计算摘要
			File f = new File(args[i]);
			ReturnDigest dr = new ReturnDigest(f);
			dr.start();
			
			//现在显示结果
			StringBuffer result = new StringBuffer(f.toString());
			result.append(": ");
			byte[] digest = dr.getDigest();
			for (int j = 0; i < digest.length; i++) {
				result.append(digest[j] + " ");
			}
			System.out.println(result);

		}
	}

}


