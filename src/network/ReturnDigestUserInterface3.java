package network;

import java.io.*;

public class ReturnDigestUserInterface3 {
	
	public static void main(String args[]) {
		
		ReturnDigest[] digests = new ReturnDigest[args.length];
		
		for (int i = 0; i < args.length; i++) {
			
			//计算摘要
			File f = new File(args[i]);
			digests[i] = new ReturnDigest(f);
			digests[i].start();
		}
		
		for (int i = 0; i < args.length; i++) {	
			while (true) {
				//现在显示结果
				byte[] digest = digests[i].getDigest();
				if (digest != null) {
					StringBuffer result = new StringBuffer(args[i]);
					result.append(": ");
					for (int j = 0; i < digest.length; i++) {
						result.append(digest[j] + " ");
						}
					System.out.println(result);
					break;
				}
			}

		}
	}

}

//猜测 result.append()只能在compliance level改为1.4中运行
//而 GetUrlHeader.java 中set<>需要编译器在1.5及更高level运行。


