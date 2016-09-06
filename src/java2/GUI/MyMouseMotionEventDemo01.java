package java2.GUI;  //鼠标拖拽操作（P743）

import java.awt.event.WindowAdapter ;
import java.awt.event.MouseMotionListener ;
import java.awt.event.WindowEvent ;
import java.awt.event.MouseEvent ;
import javax.swing.JFrame ;

class MyMouseMotionHandle extends JFrame{
	public MyMouseMotionHandle(){
		super.setTitle("Welcome To MLDN") ;
		super.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e){
				System.out.println("鼠标拖拽到：X = " + e.getX() + "，Y = " + e.getY()) ;
			}
			public void mouseMoved(MouseEvent e){
				System.out.println("鼠标移动到窗体。") ;
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


public class MyMouseMotionEventDemo01{
	public static void main(String args[]){
		new MyMouseMotionHandle() ;
	}
};

