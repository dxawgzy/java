package java2.GUI;  //（P702）
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo03 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Welcome To MLDN");
		String picPath = "d:" + File.separator + "Java" + File.separator + "icons" + File.separator + "photo.png";
		File file = new File(picPath);
		InputStream input = null;
		byte b[] = new byte[(int)file.length()];
		try {
			input = new FileInputStream(file);
			input.read(b);
			input.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(b);
		JLabel lab = null;
		lab = new JLabel("MLDN",icon,JLabel.CENTER);
		
		Font fnt = new Font("Serief",Font.ITALIC + Font.BOLD,28);
		lab.setFont(fnt);
		lab.setBackground(Color.YELLOW);
		lab.setForeground(Color.RED);
		frame.add(lab);
		frame.setSize(800,600);
		frame.setBackground(Color.WHITE);
		//Point point = new Point(300,200);
		//frame.setLocation(point);
		frame.setLocation(300,200);
		frame.setVisible(true);
	}

}

