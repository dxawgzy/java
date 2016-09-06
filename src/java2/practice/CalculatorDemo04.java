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

import java2.practice.CalcHandle.ActionHandler;

class CalcHandle04{
	JFrame frame = new JFrame("计算器");
    private String[] s = {"MC","MR","MS","M+","M-","←","CE","C","±","√",
			"7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","","0",".","+",""};
    //private JTextField result = new JTextField(20);
    //文本域设为两行，第一行显示输入，第二行显示结果
    private JTextArea result = new JTextArea("0",2,20); 
    private JLabel lab = new JLabel(); 
    
	public double op1,op2;
	public static final int ADD = 0;
	public static final int MINUS = 1;
	public static final int MULTIPLY = 2;
	public static final int DIVIDE = 3;
	public int currentOp = 0;
	private boolean opEnd = false;
	
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();


	public JButton ButtonHandle04(){
	    for(int i=0;i<s.length;i++){
	    	JButton [] but = new JButton[s.length];
	    	but[i] = new JButton(s[i]);
			pan.setLayout(new GridLayout(6,5));
			pan.add(but[i]);
			ActionHandler al = new ActionHandler();
			but[i].addActionListener(al);
			return but[i];
	    }
	}


	public CalcHandle04(){

	    pan3.setLayout(new BorderLayout());
	    pan3.add(pan, BorderLayout.CENTER);
	    pan3.add(pan2, BorderLayout.NORTH);

		lab.setText("0");
		//result.add(lab);

		//result.setLocation(30,20);
		//result.setSize(240, 80);

		pan2.add(result); 
	    pan2.setLocation(30,20);

		frame.setSize(300,420);
		frame.add(pan3);
		//frame.add(pan1);    //将标签加入到窗体
		//frame.add(lab);
		frame.pack();      //根据组件自动调整大小
		frame.setVisible(true);
	}
	

	
    class ActionHandler implements ActionListener{	
	    public void actionPerformed(ActionEvent e) {
	    	
		    if (e.getSource() == but[0]) {
		    	if (opEnd == false) result.setText("");
		    	result.setText(result.getText() + "0");
		    }
		    
		    if (e.getSource() == but[1]){
		    	if (opEnd == false) result.setText("");
		    	result.setText(result.getText() + "1");
		    	opEnd = true;
		    }
		    
		    
		    
		}
	    

	}
}

public class CalculatorDemo04 {
	public static void main(String[] args){
		new CalcHandle02();
	}
}




