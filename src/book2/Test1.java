package book2;  // P486  13.21 练习 (1)

// 创建一个有文字字段和三个按钮的程序片。当我们按下每个按钮时，
// 使不同的文字显示在文字段中。

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Test1 extends Applet {
	Button 
	    b1 = new Button("Button 1"),
	    b2 = new Button("Button 2"),
	    b3 = new Button("Button 3");
	TextField t = new TextField(20);
	
	public void init() {
		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		b3.addActionListener(new B3());
		add(b1);
		add(b2);
		add(b3);
		add(t);
	}
	
	class B1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			t.setText("Button 1,text");
		}
	}
	
	class B2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			t.setText("Button 2,true");
		}
	}
	
	class B3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			t.setText("Button 3,false");
		}
	}
	
	static class WL extends WindowAdapter {  //窗口接收器
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		Test1 applet = new Test1();
		Frame aFrame = new Frame("Test1");
		aFrame.addWindowListener(new WL());
		aFrame.add(applet,  BorderLayout.CENTER);
		aFrame.setSize(300, 200);
		applet.init();
		applet.setVisible(true);
	}
	
}



/*
P414  13.16.3  用Java 1.1 AWT 制作窗口和程序片
我们经常都需要创建一个类，使其既可作为一个窗口调用，亦可作为一个程序片调用。为做到这一点，只需
为程序片简单地加入一个main()即可，令其在一个Frame（帧）里构建程序片的一个实例。作为一个简单的
示例，下面让我们来看看如何对Button2New.java 作一番修改，使其能同时作为应用程序和程序片使用：
*/

/*
内部类WL 和main()方法是加入程序片的唯一两个元素，程序片剩余的部分则原封未动。事实上，我们通常
将WL 类和main()方法做一结小的改进复制和粘贴到我们自己的程序片里（请记住创建内部类时通常需要一
个外部类来处理它，形成它静态地消除这个需要）。我们可以看到在main()方法里，程序片明确地初始化和
开始，因为在这个例子里浏览器不能为我们有效地运行它。当然，这不会提供全部的浏览器调用stop()和
destroy()的行为，但对大多数的情况而言它都是可接受的。如果它变成一个麻烦，我们可以：
(1) 使程序片句柄为一个静态类（以代替局部可变的main()），然后：
(2) 在我们调用System.exit()之前在WindowAdapter.windowClosing()中调用applet.stop()和
applet.destroy()。
注意最后一行：
aFrame.setVisible(true);
这是Java 1.1 AWT 的一个改变。show()方法不再被支持，而setVisible(true)则取代了show()方法。当我
们在本章后面部分学习Java Beans 时，这些表面上易于改变的方法将会变得更加的合理。
这个例子同样被使用TextField 修改而不是显示到控制台或浏览器状态行上。在开发程序时有一个限制条件
就是程序片和应用程序我们都必须根据它们的运行情况选择输入和输出结构。
这里展示了Java 1.1 AWT 的其它小的新功能。我们不再需要去使用有错误倾向的利用字符串指定
BorderLayout 定位的方法。当我们增加一个元素到Java 1.1 版的BorderLayout 中时，我们可以这样写：
aFrame.add(applet, BorderLayout.CENTER);
我们对位置规定一个BorderLayout 的常数，以使它能在编译时被检验（而不是对老的结构悄悄地做不合适的
事）。这是一个显著的改善，并且将在这本书的余下部分大量地使用。

2. 将窗口接收器变成匿名类
任何一个接收器类都可作为一个匿名类执行，但这一直有个意外，那就是我们可能需要在其它场合使用它们
的功能。但是，窗口接收器在这里仅作为关闭应用程序窗口来使用，因此我们可以安全地制造一个匿名类。
然后，main()中的下面这行代码：
aFrame.addWindowListener(new WL());
会变成：
aFrame.addWindowListener(
new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});


*/



