package java2;

public class StringBuffer01 {
	public static void main(String[] args) {
		String str1 = "LiXingHua";
		for (int i=0;i<100;i++) {
			str1 += i;
		}
		System.out.println(str1);
	}

}
