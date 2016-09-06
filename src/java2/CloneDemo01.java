package java2;  //对象克隆技术（P375）

class Person2 implements Cloneable {  //必须实现Cloneable接口
	private String name = null;
	public Person2(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	//需要子类覆写clone方法
	public Object clone() throws CloneNotSupportedException {
		return super.clone();  //具体的克隆操作由父类完成
	}
	public String toString(){
		return "姓名：" + this.getName();
	}
	
}

public class CloneDemo01 {
	public static void main(String[] args) throws Exception {
		Person2 p1 = new Person2("张三");
		Person2 p2 = (Person2) p1.clone();
		//p2.setName("李四");
		System.out.println("原始对象：" + p1);
		System.out.println("克隆之后的对象：" + p2);
	}

}
