package book;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class Branch {
	DefaultMutableTreeNode r;
	public Branch(String[] data) {
		r = new DefaultMutableTreeNode(data[0]);
		for(int i = 0;i < data.length; i++) {
			r.add(new DefaultMutableTreeNode(data[i]));
		}
	}
	
	public DefaultMutableTreeNode node() {
		return r;
	}
}

public class Trees extends JPanel {
	String[][] data = {
			{"Colors", "Red", "Blue", "Green"},
			{ "Flavors", "Tart", "Sweet", "Bland" },
			{ "Length", "Short", "Medium", "Long" },
			{ "Volume", "High", "Medium", "Low" },
			{ "Temperature", "High", "Medium", "Low" },
			{ "Intensity", "High", "Medium", "Low" },
	};
	static int i = 0;
	DefaultMutableTreeNode root, child, chosen;
	JTree tree;
	DefaultTreeModel model;
	public Trees() {
		setLayout(new BorderLayout());
		root = new DefaultMutableTreeNode("root");
		tree = new JTree(root);
		add(new JScrollPane(tree), BorderLayout.CENTER);
		model = (DefaultTreeModel)tree.getModel();
		JButton test = new JButton("Press me");
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i < data.length) {
					child = new Branch(data[i++]).node();
					chosen = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
					if(chosen == null) chosen = root;
					model.insertNodeInto(child, chosen , 0);
				}
			}
		});
		
		test.setBackground(Color.blue);
		test.setForeground(Color.white);
		JPanel p = new JPanel();
		p.add(test);
		add(p, BorderLayout.SOUTH);
	}
	
	public static void main(String args[]) {
		Show.inFrame(new Trees(), 200, 500);
	}

}



