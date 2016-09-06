package java2;  //11.2.2 得到JVM的内存空间信息（P343）

public class RuntimeDemo {
    public static void main(String[] args) {
    	Runtime run = Runtime.getRuntime();
    	System.out.println("JVM最大内存量：" + run.maxMemory());
    	System.out.println("JVM空闲内存量：" + run.freeMemory());
    	String str = "Helllo " + "World " + "!!!" + "\t" + "Welcome " + "To " + "MLDN " + "~";
    	System.out.println(str);
    	for (int i=0;i<1000;i++) {
    		str += i;
    	}
    	System.out.println("操作String之后的JVM空闲内存量：" + run.freeMemory());
    	run.gc();
    	System.out.println("垃圾回收之后的JVM空闲内存量：" + run.freeMemory());
    }

}
