package book2;

import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet {
	public void paint(Graphics g) {
		g.drawString("First applet", 10, 10);
	}

}

// <applet code=Applet1.class width=200 height=100></applet>

// 新建一个文件夹，将本程序第一行 package book2; 去掉，然后 javac Applet1.java 编译，
// 再 appletviewer Applet1,java 即可执行程序
// 程序也可直接在 Eclipse 中运行

