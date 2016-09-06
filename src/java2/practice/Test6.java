package java2.practice;

class ValHold {
	public int i = 10;
}

public class Test6 {
	public static void main(String args[]) {
		Test6 o = new Test6();
		o.amethod();
	}
	public void amethod() {
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;
		another(v,i);
		System.out.println(v.i + " " + i);
	}
	
	public void another(ValHold v, int i) {
		i = 0;
		v.i = 20;
		ValHold vh = new ValHold();
		v = vh;
		System.out.println(v.i + " " + i);
	}

}




