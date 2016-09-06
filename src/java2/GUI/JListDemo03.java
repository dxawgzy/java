package java2.GUI;

import javax.swing.JFrame ;
import javax.swing.JList ;
import javax.swing.BorderFactory ;
import javax.swing.JScrollPane ;
import javax.swing.AbstractListModel ;
import java.awt.Container ;
import java.awt.event.WindowAdapter ;
import java.awt.event.WindowEvent ;
import javax.swing.event.ListSelectionListener ;
import javax.swing.event.ListSelectionEvent ;

class MyListModel extends AbstractListModel{
	private String nations[] = {"中国","巴西","美国","韩国","意大利","法国"} ;
	public Object getElementAt(int index){
		if(index<this.nations.length){
			return this.nations[index] ;
		}else{
			return null ;
		}
	}
	public int getSize(){
		return this.nations.length ;
	}
}

class MyList02 implements ListSelectionListener{
	private JFrame frame = new JFrame("Welcome To MLDN") ;
	private Container cont = frame.getContentPane() ;	// 得到窗体容器
	private JList list1 = null ;

	public MyList02(){
		this.list1 = new JList(new MyListModel()) ;
		list1.setBorder(BorderFactory.createTitledBorder("你喜欢去那个国家旅游？")) ;
		list1.addListSelectionListener(this) ;
		this.cont.add(new JScrollPane(this.list1)) ;
		this.frame.setSize(330,180) ;
		this.frame.setVisible(true) ;
		this.frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent a){
				System.exit(1) ;
			}
		}) ;
	}

	public void valueChanged(ListSelectionEvent e){	// 事件处理
		int temp[] = list1.getSelectedIndices() ;
		System.out.print("选定的内容：") ;
		for(int i=0;i<temp.length;i++){
			System.out.print(list1.getModel().getElementAt(i) + "、") ;
		}
		System.out.println() ;
	}

}

public class JListDemo03{
	public static void main(String args[]){
		new MyList02() ;
	}
}

//运行结果有误，单击任一个国家时均显示选定了中国



