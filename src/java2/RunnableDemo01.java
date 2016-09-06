package java2;  //Java开发实战经典 第九章 多线程（P272）

class MyThread2 implements Runnable {
	private String name;	
	public MyThread2(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(name + "运行, i=" +i);
		}
	}
}

public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("线程A ");
		MyThread2 mt2 = new MyThread2("线程B ");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}

}


