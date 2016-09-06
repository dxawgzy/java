package java2.GUI;  //（P701）
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo02 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Welcome To MLDN");
		JLabel lab = new JLabel("MLDN",JLabel.CENTER);
		
		Font fnt = new Font("Serief",Font.ITALIC + Font.BOLD,28);
		lab.setFont(fnt);
		lab.setForeground(Color.RED);
		frame.add(lab);
		//Dimension dim = new Dimension();
		//dim.setSize(300,400);
		//frame.setSize(dim);
		frame.setSize(300,400);
		
		frame.setBackground(Color.WHITE);
		Point point = new Point(300,200);
		frame.setLocation(point);
		frame.setVisible(true);
	}

}
