package java2;  //生成10个随机数，且不大于100 （P368）

import java.util.Random;

public class RandomDemo01 {
	public static void main(String[] args){
		Random r = new Random();  //定义Random对象
		for (int i=0;i<10;i++){  //输出10个随机数
			System.out.print(r.nextInt(100) + "\t");
		}
	}

}
