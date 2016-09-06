package java2.practice;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws IOException{
		int a[]={83,75,92,67,55,99,78,61};
		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.readLine());
		int index = -1;
		for (int i=0;i<8;++i){
			if(a[i] == x){
				index = i;
				break;
			}
		}
		
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println(x + "zaishuzuzhongdexuhaoshi" + index);
	}

}



