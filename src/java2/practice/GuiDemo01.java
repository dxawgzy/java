package java2.practice;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ActionHandle{
	private JFrame frame = new JFrame("Welcome to GUI");
	private JButton but = new JButton("显示");
	private JLabel lab = new JLabel();
	private JTextField text = new JTextField(10);
	private JPanel pan = new JPanel();
	public ActionHandle(){
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 28);  //ITALIC斜体，BOLD加粗
		lab.setFont(fnt);
		lab.setText("等待用户输入信息！");
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if (arg0.getSource() == but){
					lab.setText(text.getText());
				}
			}
		});
	    frame.addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent arg0){
			    System.exit(1);
		    }
	    });
		frame.setLayout(new GridLayout(2,1));
		pan.setLayout(new GridLayout(1,2));
		pan.add(text);     //向面板加入文本域
		pan.add(but);
		frame.add(pan);    //将标签加入到窗体
		frame.add(lab);
		frame.pack();      //根据组件自动调整大小
		frame.setVisible(true);
	}
} 

public class GuiDemo01 {
	public static void main(String[] args){
		new ActionHandle();
	}

}



