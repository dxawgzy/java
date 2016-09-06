﻿package book;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Popup extends JPanel{
	JPopupMenu popup = new JPopupMenu();
	JTextField t = new JTextField(10);
	public Popup() {
		add(t);
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(((JMenuItem)e.getSource()).getText());
			}
		};
		JMenuItem m = new JMenuItem("Hither");
		m.addActionListener(al);
		popup.add(m);
		m = new JMenuItem("Yon");
		m.addActionListener(al);
		popup.add(m);
		m = new JMenuItem("Afar");
		m.addActionListener(al);
		popup.add(m);
		popup.addSeparator();
		m = new JMenuItem("Stay Here");
		m.addActionListener(al);
		popup.add(m);
		PopupListener pl = new PopupListener();
		addMouseListener(pl);
		t.addMouseListener(pl);
	}
	
	class PopupListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			maybeShowPopup(e);
		}
		public void mouseReleased(MouseEvent e) {
			maybeShowPopup(e);
		}
		public void maybeShowPopup(MouseEvent e) {
			if(e.isPopupTrigger()) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		}
	}
	
	public static void main(String args[]) {
		Show.inFrame(new Popup(), 200, 150);
	}

}


