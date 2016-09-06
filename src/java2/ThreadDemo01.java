package java2;  //Java开发实战经典 第九章 多线程（P267）

class MyThread extends Thread {
	private String name;	
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(name + "运行, i=" +i);
		}
	}
};

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("线程A ");
		MyThread mt2 = new MyThread("线程B ");
		//mt1.run();
		//mt2.run();
		mt1.start();
		mt2.start();
	}

};




