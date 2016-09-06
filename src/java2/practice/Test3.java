package java2.practice;

public class Test3 {
	public static void main(String args[]){
		One one = new One("Hello");
		one.getString("Xiao ming!");
	}

}

class One{
	private String myStr;
	public One(String str){
		myStr = str;
	}
	public void getString(String str){
		System.out.println(myStr + "" + str);
	}
}




