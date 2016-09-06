package java2.practice;   //计算器

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CalcHandle{
	JFrame frame = new JFrame("计算器");
	JTextField result = new JTextField(20);

	JButton but0 = new JButton("0");
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton butadd = new JButton("+");
	JButton butminus = new JButton("-");
	JButton butmultiply = new JButton("*");
	JButton butdivide = new JButton("/");
	JButton butequal = new JButton("=");
	JButton butpercent = new JButton("%");
	JButton butbackspace = new JButton("←");
	JButton butplusminus = new JButton("±");
	JButton butpoint = new JButton(".");
	JButton butclear = new JButton("C");
	JButton butsquare = new JButton("√");
	JButton butreciprocal = new JButton("1/x");
	JButton buta = new JButton();  //预留三个空按钮，便于排版美观
	JButton butb = new JButton();
	JButton butc = new JButton();
	
	JPanel pan = new JPanel();
	JPanel pan1 = new JPanel();  //按钮区域面板
	JPanel pan2 = new JPanel();  //结果显示区域面板
	
	public double op1,op2;
	public static final int ADD = 0;
	public static final int MINUS = 1;
	public static final int MULTIPLY = 2;
	public static final int DIVIDE = 3;
	public int currentOp = 0;
	private boolean opEnd = false;
	
	public CalcHandle(){
		
		pan1.setLayout(new GridLayout(5,5));
		pan1.add(but7);
		pan1.add(but8);
		pan1.add(but9);
		pan1.add(butdivide);
		pan1.add(butpercent);
		
		pan1.add(but4);
		pan1.add(but5);
		pan1.add(but6);
		pan1.add(butmultiply);
		pan1.add(butreciprocal);
		
		pan1.add(but1);
		pan1.add(but2);
		pan1.add(but3);
		pan1.add(butminus);
		pan1.add(butsquare);
		
		pan1.add(but0);
		pan1.add(butplusminus);
		pan1.add(butpoint);
		pan1.add(butadd);
		pan1.add(butequal);
		
		pan1.add(buta);
		pan1.add(butbackspace);
		pan1.add(butb);
		pan1.add(butclear);
		pan1.add(butc);
	    
		pan2.add(result); 
		
	    pan.setLayout(new BorderLayout());
	    pan.add(pan1, BorderLayout.CENTER); //设置位置
	    pan.add(pan2, BorderLayout.NORTH);
	    
	    addActionListeners();
		
		frame.setSize(300,340);
		frame.add(pan);
		//frame.pack();      //根据组件自动调整大小
		frame.setVisible(true);
	}
	
	private void addActionListeners(){
		ActionHandler al = new ActionHandler();
		but0.addActionListener(al);
		but1.addActionListener(al);
		but2.addActionListener(al);
		but3.addActionListener(al);
		but4.addActionListener(al);
		but5.addActionListener(al);
		but6.addActionListener(al);
		but7.addActionListener(al);
		but8.addActionListener(al);
		but9.addActionListener(al);
		butadd.addActionListener(al);
		butminus.addActionListener(al);
		butmultiply.addActionListener(al);
		butdivide.addActionListener(al);
		butequal.addActionListener(al);
		butpercent.addActionListener(al);
		butbackspace.addActionListener(al);
		butplusminus.addActionListener(al);
		butpoint.addActionListener(al);
		butclear.addActionListener(al);
		butsquare.addActionListener(al);
		butreciprocal.addActionListener(al);
	}
	
    class ActionHandler implements ActionListener{
    	
	    public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == but0) {
		    	if (opEnd == false){
		    		result.setText("");
		    	}
		    	result.setText(result.getText() + "0");
		    }
		    
		    if (e.getSource() == but1){
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
	}

}


public class CalculatorDemo01 {
	public static void main(String[] args){
		new CalcHandle();
	}
}



