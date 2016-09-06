package java2.mysql;  //使用PreparedStatement完成数据插入操作（P655）
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class MysqlDemo05 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test1?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String name = "李兴华";
		String password = "www.mldnjava.cn";
		int age = 30;
		String sex = "男";
		String birthday = "2007-07-27";
		java.util.Date temp = null;
		temp = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
		java.sql.Date bir = new java.sql.Date(temp.getTime());
		
	    //String sql = "INSERT INTO user (name,password,age,sex,birthday)"
	    //		+ "VALUES ('lxh','www.mldn.cn',30,'男','2008-08-2')";
		String sql = "INSERT INTO user (name,password,age,sex,birthday)"
				+ "VALUES (?,?,?,?,?)";
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1,name);
		pstmt.setString(2,password);
		pstmt.setInt(3,age);
		pstmt.setString(4,sex);
		pstmt.setDate(5,bir);
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();

	}

}


