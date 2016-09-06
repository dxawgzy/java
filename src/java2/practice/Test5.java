package java2.practice;

class J_SuperClass {
	void mb_method() {
	System.out.println("J_SuperClass::mb_method");
	}
	
	static void mb_methodStatic() {
		System.out.println("J_SuperClass::mb_methodStatic");
	}
	
}


public class Test5 extends J_SuperClass {
	void mb_method() {
		System.out.println("Test5::mb_method");
	}
	
	static void mb_methodStatic(){
		System.out.println("Test5::mb_methodStatic");
	}
	
	public static void main(String args[]) {
		J_SuperClass a = new Test5();
		a.mb_method();
		a.mb_methodStatic();
		Test5 b = new Test5();
		b.mb_method();
		b.mb_methodStatic();
	}
	
}



 
