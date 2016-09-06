package java2.caidan;    //菜单显示（P449）

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class InputData02 {
	
	private BufferedReader buf = null;
	
	public InputData02() {
		this.buf = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getString(String info) {
		String temp = null;
		System.out.print(info);
		try {
			temp = this.buf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public int getInt(String info,String err) {
		int temp = 0;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			if (str.matches("^\\d+$")) {
				temp = Integer.parseInt(str);
				flag = false;
			} else {
				System.out.println(err);
			}
		}
		return temp;
	}
	
	public float getFloat(String info,String err) {
		float temp = 0;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			if (str.matches("^\\d+.?\\d+$")) {
				temp = Float.parseFloat(str);
				flag = false;
			} else {
				System.out.println(err);
			}
		}
		return temp;
	}
	
	public Date getDate(String info,String err) {
		Date d = null;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			if (str.matches("^\\d[4]-\\d[2]-\\d[2]$")) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					d = sdf.parse(str);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				flag = false;
			} else {
				System.out.println(err);
			}
		}
		return d;
	}

}



class Operate02 {
	public static void add() {
		System.out.println("**选择的是增加操作");
	}
	
	public static void delete() {
		System.out.println("**选择的是删除操作");
	}
	
	public static void update() {
		System.out.println("**选择的是更新操作");
	}
	
	public static void find() {
		System.out.println("**选择的是查看操作");
	}

}



class Menu02 {
	public Menu02() {
		while (true) {
			this.show();
		}
	}
	public void show() {
		System.out.println("==== Xxx系统 =====");
		System.out.println("[1]、增加数据");
		System.out.println("[2]、删除数据");
		System.out.println("[3]、更新数据");
		System.out.println("[4]、查看数据");
		System.out.println("[0]、系统退出\n");
		InputData02 input = new InputData02();
		int i = input.getInt("请选择：","请输入正确的选项！");
		switch (i) {
		    case 1: {
		    	Operate02.add();
		    	break;
		    }
		    case 2: {
		    	Operate02.delete();
		    	break;
		    }
		    case 3: {
		    	Operate02.update();
		    	break;
		    }
		    case 4: {
		    	Operate02.find();
		    	break;
		    }
		    case 0: {
		    	System.exit(1);
		    	break;
		    }
		    default: {
		    	System.out.println("请选择正确的操作！");
		    }
		}
	}

}



public class MenuDemo01 {
	public static void main(String[] args) throws Exception {
		new Menu02();
	}
}



