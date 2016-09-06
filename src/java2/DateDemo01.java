package java2;  //基于SimpleDateFormat类（P366）
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTime{
	private SimpleDateFormat sdf = null;
	public String getDate(){
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		return this.sdf.format(new Date());
	}
	public String getDateCompute(){
		this.sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
		return this.sdf.format(new Date());
	}
	public String getTimeStamp(){
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}
}

public class DateDemo01 {
	public static void main(String[] args){
		DateTime dt = new DateTime();
		System.out.println("系统日期：" + dt.getDate());
		System.out.println("中文日期：" + dt.getDateCompute());
		System.out.println("时间戳：" + dt.getTimeStamp());
	}

}
