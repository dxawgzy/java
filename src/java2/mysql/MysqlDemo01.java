package java2.mysql;

public class MysqlDemo01 {
	//public static final String DBDRIVER = "org.git.mm.mysql.Driver";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static void main(String[] args){
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
