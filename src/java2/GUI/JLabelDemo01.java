package java2.GUI;  //（P700）
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo01 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Welcome To MLDN");
		JLabel lab = new JLabel("MLDN",JLabel.CENTER);
		frame.add(lab);
		Dimension dim = new Dimension();
		dim.setSize(400,300);
		frame.setSize(dim);
		frame.setBackground(Color.WHITE);
		Point point = new Point(300,200);
		frame.setLocation(point);
		frame.setVisible(true);
	}

}
