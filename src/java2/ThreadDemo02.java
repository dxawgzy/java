package java2;  //继承Thread类不能资源共享

class MyThread3 extends Thread{
	private int ticket = 5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票: ticket = " + ticket--);
			}
		}
	}
}

public class ThreadDemo02 {
	public static void main(String[] args){
		MyThread3 mt1 = new MyThread3();  //启动3个线程各自卖了5张票
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
