package java2;

public class SystemDemo01 {
	public static void main (String[] args) {
		long startTime = System.currentTimeMillis();
		int sum = 0;
		
		for (int i=0;i<300000;i++) {
			sum +=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("sum = " + sum);
		System.out.println("计算所花费的时间：" + (endTime - startTime)+"毫秒");
	}

}
