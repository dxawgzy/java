package java2.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlDemo03 {
	//public static final String DBDRIVER = "org.git.mm.mysql.Driver";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test1?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO user (name,password,age,sex,birthday)"
				+ "VALUES ('lxh','www.mldn.cn',30,'男','2008-08-2')";
		
		Class.forName(DBDRIVER);

		conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();

	}

}

