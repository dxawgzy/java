package java2.practice;   //计算器

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.JTextField;

class CalcHandle02{
	JFrame frame = new JFrame("计算器");
    private String[] s = {"MC","MR","MS","M+","M-","←","CE","C","±","√",
			"7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","","0",".","+",""};
    //private JTextField result = new JTextField(20);
    //文本域设为两行，第一行显示输入，第二行显示结果
    private JTextArea jta = new JTextArea("0",2,20); 
    private JLabel lab = new JLabel(); 
    
	public double op1,op2;
	public static final int ADD = 0;
	public static final int MINUS = 1;
	public static final int MULTIPLY = 2;
	public static final int DIVIDE = 3;
	public int currentOp = 0;
	private boolean opEnd = false;
	
	public CalcHandle02(){
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		//JButton but = null;
	    for(int i=0;i<s.length;i++){
			//but = new JButton(s[i]);
			//JButton but = new JButton("x"+i);
			//but.setLocation(30+50*(i/5),110+50*(i%5));  //设置按钮的位置坐标及按钮大小
			//but[i].setSize(40,30);
			
	    	JButton [] but = new JButton[s.length];
	    	but[i] = new JButton(s[i]);
			pan.setLayout(new GridLayout(6,5));
			pan.add(but[i]);
/*			
			but.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					if (arg0.getSource() == but){
						lab.setText(text.getText());
					}
				}
			});
*/			
		}
	    
	    pan3.setLayout(new BorderLayout());
	    pan3.add(pan, BorderLayout.CENTER);// 设置位置
	    pan3.add(pan2, BorderLayout.NORTH);
	    
		lab.setText("0");
		//result.add(lab);
		
		//result.setLocation(30,20);
		//result.setSize(240, 80);
		
		//pan2.add(result); 
	    pan2.add(jta); 
	    pan2.setLocation(30,20);
	
		frame.setSize(300,420);
		frame.add(pan3);
		//frame.add(pan1);    //将标签加入到窗体
		//frame.add(lab);
		frame.pack();      //根据组件自动调整大小
		frame.setVisible(true);

/*	    frame.addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent arg0){
			    System.exit(1);
		    }
	    });
*/
	    
	}
} 

public class CalculatorDemo02 {
	public static void main(String[] args){
		new CalcHandle02();
	}
}


//使用此方式有问题， but = new JButton(s[i]); 虽可以对每个按钮设值，
//但所有按钮名称均为 but ,后续 pan.add(but); but.addActionListener(al); 无法使用
//由于 but 是 JButton ,故无法使用 but[i]，类型不一致



