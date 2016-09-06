package java2.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDemo02 {
	//public static final String DBDRIVER = "org.git.mm.mysql.Driver";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/test1?useSSL=false";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	public static void main(String[] args){
		Connection conn = null;
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
