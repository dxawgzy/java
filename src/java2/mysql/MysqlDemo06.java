package java2.mysql;  //模糊查询（P657）
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MysqlDemo06 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test1?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String keyWord = "李";	
		ResultSet rs = null;
		String sql = "SELECT id,name,password,age,sex,birthday " +
				"FROM user WHERE name LIKE ? OR password LIKE ? OR sex LIKE ?";
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"%" + keyWord + "%");
		pstmt.setString(2,"%" + keyWord + "%");
		pstmt.setString(3,"%" + keyWord + "%");
		
		rs = pstmt.executeQuery();
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String password = rs.getString(3);
			int age = rs.getInt(4);
			String sex = rs.getString(5);
			java.util.Date d = rs.getDate(6);
			System.out.print("编号：" + id + "；");
			System.out.print("姓名：" + name + "；");
			System.out.print("密码：" + password + "；");
			System.out.print("年龄：" + age + "；");
			System.out.print("性别：" + sex + "；");
			System.out.println("生日：" + d);
			System.out.println("--------------------------------");			
		}	
		rs.close();
		pstmt.close();
		conn.close();

	}

}


