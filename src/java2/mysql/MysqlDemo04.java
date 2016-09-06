package java2.mysql;  //从user表中查询数据（P652）
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDemo04 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test1?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT id,name,password,age,sex,birthday FROM user";
		
		Class.forName(DBDRIVER);

		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String password = rs.getString("password");
			int age = rs.getInt("age");
			String sex = rs.getString("sex");
			java.util.Date d = rs.getDate("birthday");
			System.out.print("编号：" + id + "；");
			System.out.print("姓名：" + name + "；");
			System.out.print("密码：" + password + "；");
			System.out.print("年龄：" + age + "；");
			System.out.print("性别：" + sex + "；");
			System.out.println("生日：" + d);
			System.out.println("--------------------------------");			
		}	
		
		rs.close();
		stmt.close();
		conn.close();

	}

}


