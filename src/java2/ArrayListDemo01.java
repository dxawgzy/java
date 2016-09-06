package java2;  //(P499)
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List<String> allList = null;
		allList = new ArrayList<String>();
		System.out.println("集合操作前是否为空?" + allList.isEmpty());
		allList.add("Hello");
		allList.add(0,"World");
		allList.add("MLDN");
		allList.add("www.mldn.cn");
		System.out.println("集合allList为：" + allList);
		System.out.println(allList.contains("Hello") ? "\"Hello\"字符串存在!" : "\"Hello\"字符串不存在!");
		List<String> allSub = allList.subList(2, 3);
		System.out.println("集合allSub为：" + allSub);
		System.out.print("集合截取：");
		for (int i=0;i<allSub.size();i++) {
			System.out.print(allList.get(i) + "、");
		}
		System.out.println("");
		System.out.println("MLDN字符串的位置：" + allList.indexOf("MLDN"));
		System.out.println("集合操作后是否为空？" + allList.isEmpty());
	}

}


