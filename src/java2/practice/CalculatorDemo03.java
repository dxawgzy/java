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

class CalcHandle03{
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
	
	public CalcHandle03(){
		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();

	    for(int i=0;i<s.length;i++){
	    	JButton [] but = new JButton[s.length];
	    	but[i] = new JButton(s[i]);
			pan.setLayout(new GridLayout(6,5));
			pan.add(but[i]);

			but[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if (e.getSource() == but[0]) {
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "0");
				    }
				    
				    if (e.getSource() == but[1]){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "1");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but2){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "2");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but3){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "3");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but4){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "4");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but5){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "5");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but6){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "6");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but7){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "7");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but8){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "8");
				    	opEnd = true;
				    }
				    
				    if (e.getSource() == but9){
				    	if (opEnd == false){
				    		result.setText("");
				    	}
				    	result.setText(result.getText() + "9");
				    	opEnd = true;
				    }
				    
				    try {
				    	if (e.getSource() == butadd){
				    		op1 = Double.parseDouble(result.getText());
				    		opEnd = false;
				    		currentOp = ADD;
				    	}
				    	
				    	if (e.getSource() == butminus){
				    		op1 = Double.parseDouble(result.getText());
				    		opEnd = false;
				    		currentOp = MINUS;
				    	}
				    	
				    	if (e.getSource() == butmultiply){
				    		op1 = Double.parseDouble(result.getText());
				    		opEnd = false;
				    		currentOp = MULTIPLY;
				    	}
				    	
				    	if (e.getSource() == butdivide){
				    		op1 = Double.parseDouble(result.getText());
				    		opEnd = false;
				    		currentOp = DIVIDE;
				    	}

				    	if (e.getSource() == butpoint){
				    		String tmp = result.getText();
				    		if (tmp.equals("")){
				    			return;
				    		}
				    		if (tmp.indexOf(".") != -1){  //indexOf方法获取到指定的字符在字符串中第一次出现的位置，从0开始。
				    			return;   //如果一开始就是.则返回0，如果第二个位置是.则返回1，如果搜完整个字符串都没有.则返回-1 。
				    		}
				    		tmp = tmp+ '.';  //在原字符串后加小数点
				    		result.setText(tmp);
				    	}
				    	
				    	if (e.getSource() == butplusminus){
				    		String tmp = result.getText();
				    		if (tmp.equals("") || tmp.equals("0")){
				    			return;
				    		}
				    		if (tmp.charAt(0) == '-'){   //检索字符串的第一位（用0表示）是否是字符"-"负号
				    			tmp = tmp.substring(1);  //子字符串，1表示从原字符串第二位开始，即去掉了负号
				    		} else {
				    			tmp = '-' + tmp;   //在原字符串前加负号
				    		}
				    		result.setText(tmp);
				    	}
				    	
				    	if (e.getSource() == butsquare) {
				    		String tmp = result.getText();
				    		if (tmp.equals("")){
				    			return;
				    		}
				    		double d = Double.parseDouble(tmp);
				    		if (d<0){
				    			result.setText("不能对负数求平方根");
				    			return;
				    		}
				    		op2 = Math.sqrt(d);
				    		result.setText(op2 + "");
				    	}
				    	
				    	if (e.getSource() == butbackspace) {
				    		String tmp = result.getText();
				    		result.setText("");
				    		for (int i=0;i<tmp.length()-1;i++){
				    			char a = tmp.charAt(i);
				    			result.setText(result.getText() + a);
				    		}
				    	}
				    	
				    	if (e.getSource() == butclear){
				    		result.setText("0");
				    		opEnd = false;
				    	}
				    	
				    	if (e.getSource() == butequal){
				    		op2 = Double.parseDouble(result.getText());
				    		switch (currentOp){
				    		case ADD:
				    			result.setText(op1 + op2 + "");
				    			break;
				    		case MINUS:
				    			result.setText(op1 - op2 + "");
				    			break;
				    		case MULTIPLY:
				    			result.setText(op1 * op2 + "");
				    			break;
				    		case DIVIDE:
				    			if (op2 == 0){
				    				result.setText("除数不能为零");
				    				break;
				    			}
				    			result.setText(op1 / op2 + "");
				    			break;
				    		}
				    		opEnd = false;
						}
						
					} catch (Exception e1){
						result.setText("Wrong");
						opEnd = false;
					}
					
					
					
					
				}
			});
			
		}

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

/*	    frame.addWindowListener(new WindowAdapter(){
		    public void windowClosing(WindowEvent arg0){
			    System.exit(1);
		    }
	    });
*/

	}
}

public class CalculatorDemo03 {
	public static void main(String[] args){
		new CalcHandle02();
	}
}




