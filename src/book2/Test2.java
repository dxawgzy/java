package book2;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Test2 extends Applet{
	JButton jb1 = new JButton("Start");
	JButton jb2 = new JButton("Stop");
	JTextArea jta1 = new JTextArea("JTextArea Test",3,30);  //3行30列
	JTextField jtf1 = new JTextField("JTextField Test", 30);  //30列，只能1行
	JMenu jm1 = new JMenu();
	
	
	public void init() {
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = ((JButton)e.getSource()).getText();
				jtf1.setText(name + " Pressed");
			}
		};
		jb1.addActionListener(al);
		jb2.addActionListener(al);
		add(jb1);
		add(jb2);
		add(jta1);
		add(jtf1);
		add(jm1);
	}
	
	public static void main(String args[]) {
		Test2 applet = new Test2();
		JFrame frame = new JFrame("TextAreaNew");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(applet, BorderLayout.CENTER);
		frame.setSize(600, 450);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}

}



