package java2.GUI;
import java.awt.Color;
import javax.swing.JFrame;

public class JFrameDemo01 {
	public static void main(String[] args){
		JFrame f = new JFrame("第一个Swing窗体");
		f.setSize(400, 300);
		f.setBackground(Color.WHITE);
		f.setLocation(300,200);
		f.setVisible(true);
	}

}
