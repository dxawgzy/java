package java2.practice;

public class Test8 {
	public static void mb_method(int i) {
		try {
			if(i==1)
				throw new Exception();
			System.out.print("1");
		}catch (Exception ex) {
			System.out.print("2");
			return;
		}
		finally {
			System.out.print("3");
		}
		System.out.print("4");
	}
	
	public static void main(String args[]) {
		mb_method(0);
		mb_method(1);
	}

}


