package java2.GUI;  //（P742）

import java.awt.event.WindowAdapter ;
import java.awt.event.MouseAdapter ;
import java.awt.event.WindowEvent ;
import java.awt.event.MouseEvent ;
import javax.swing.JFrame ;
import javax.swing.JTextArea ;
import javax.swing.JScrollPane ;

class MyMouseHandle02 extends JFrame{
	private JTextArea text = new JTextArea() ;
	public MyMouseHandle02(){
		super.setTitle("Welcome To MLDN") ;
		JScrollPane scr = new JScrollPane(text) ;
		scr.setBounds(5,5,300,200) ;
		super.add(scr) ;
		text.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int c = e.getButton() ;
				String mouseInfo = null ;
				if(c==MouseEvent.BUTTON1){
					mouseInfo = "左键" ;
				}
				if(c==MouseEvent.BUTTON3){
					mouseInfo = "右键" ;
				}
				if(c==MouseEvent.BUTTON2){
					mouseInfo = "滚轴" ;
				}
				text.append("鼠标单击：" + mouseInfo + "\n") ;
			}
		}) ;
		super.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(1) ;
			}
		}) ;	// 加入事件
		super.setSize(310,210) ;
		super.setVisible(true) ;
	}
};


public class MyMouseEventDemo02{
	public static void main(String args[]){
		new MyMouseHandle02() ;
	}
};

