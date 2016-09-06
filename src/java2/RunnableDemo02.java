package java2;  //实现Runnable接口可以资源共享

class MyThread4 implements Runnable{
	private int ticket = 5;
	public void run(){
		for(int i=0;i<100;i++){
			if(ticket>0){
				System.out.println("卖票: ticket = " + ticket--);
			}
		}
	}
}

public class RunnableDemo02 {
	public static void main(String[] args){
		MyThread4 mt = new MyThread4();
		new Thread(mt).start();  //启动3个线程共卖5张票
		new Thread(mt).start();
		new Thread(mt).start();
	}
}