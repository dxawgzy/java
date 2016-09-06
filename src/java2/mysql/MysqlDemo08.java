package java2.mysql;  //从bookshop的user表中查询数据（P652）
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDemo08 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/bookshop?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from user";
		
		Class.forName(DBDRIVER);

		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String password = rs.getString("password");
			String name = rs.getString("name");
			String telephone = rs.getString("telephone");
			String email = rs.getString("email");
			String address = rs.getString("address");
			
			System.out.print("编号：" + id + "；");
			System.out.print("用户名：" + username + "；");
			System.out.print("密码：" + password + "；");
			System.out.print("姓名：" + name + "；");
			System.out.print("电话：" + telephone + "；");
			System.out.print("邮件：" + email + "；");
			System.out.println("地址：" + address);
			System.out.println("--------------------------------");			
		}	
		
		rs.close();
		stmt.close();
		conn.close();

	}

}



