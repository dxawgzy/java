﻿package book;  // P468  13.19.3 显示框架
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Show {
	
	public static void inFrame(JPanel jp, int width, int height) {
		String title = jp.getClass().toString();
		if(title.indexOf("class") != -1){
			title = title.substring(6);
		}
		JFrame frame = new JFrame(title);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.getContentPane().add(jp, BorderLayout.CENTER);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}



