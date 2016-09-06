package java2;  // （P510）
import java.util.HashSet;
import java.util.Set;

class Person3 {
	private String name;
	private int age;
	public Person3 (String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person3)) {
			return false;
		}
		Person3 p = (Person3) obj;
		if (this.name.equals(p.name) && this.age == p.age ) {
			return true;
		} else {
			return false;
		}
	}
	public int hashCode(){
		return this.name.hashCode() * this.age;
	}
	public String toString() {
		return "姓名: " + this.name + "; 年龄: " + this.age;
	}
}

public class RepeatDemo01 {
	public static void main(String[] args){
		Set<Person3> allSet = new HashSet<Person3>();
		allSet.add(new Person3("张三",30));
		allSet.add(new Person3("李四",31));
		allSet.add(new Person3("王五",32));
		allSet.add(new Person3("王五",32));
		allSet.add(new Person3("赵六",33));
		allSet.add(new Person3("孙七",33));
		System.out.println(allSet);
	}

}
