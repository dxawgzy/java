package book;  // P483  13.19.15 卡片式对话框

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Tabbed extends JPanel {
	static Object[][] q = {
			{"Felix", Borders.class },
			{"the Professor", Buttons.class },
			{"Rock Bottom", ButtonGroups.class },
			{ "Simon", Menus.class },
			{ "Alvin", Popup.class },
			{ "Tom", ListCombo.class },
			{ "Jerry", Progress.class },
			{ "Bugs", Trees.class },
			{ "Daffy", Table.class },
	};
	
	static JPanel makePanel(Class c) {
		String title = c.getName();
		title = title.substring(title.lastIndexOf('.' + 1));
		JPanel sp = null;
		try {
			sp = (JPanel)c.newInstance();
		} catch (Exception e) {
			System.out.println(e);
		}
		sp.setBorder(new TitledBorder(title));
		return sp;
	}
	
	public void Tabbed() {
		setLayout(new BorderLayout());
		JTabbedPane tabbed = new JTabbedPane();
		for (int i = 0; i < q.length;i++) {
			tabbed.addTab((String)q[i][0],makePanel((Class)q[i][1]));
		}
		
		add(tabbed, BorderLayout.CENTER);
		tabbed.setSelectedIndex(q.length/2);
	}
	
	public static void main(String args[]) {
		Show.inFrame(new Tabbed(), 460, 350);
	}

}



