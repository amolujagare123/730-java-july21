package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		// 1. loading a driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 . creating a connection
		
		String url = "jdbc:mysql://localhost:3306/730batch";
		String user = "root";
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		// 3. creating a statement 
		
		Statement st = con.createStatement();
		
		// 4. execute query
		//String sql = "insert into student values(6 ,'amol','comp',89)";
		//String sql = "delete from student where rno=3";
		String sql = "update student set branch='IT',marks=100 where rno=5";
			
		st.executeUpdate(sql);
		
		st.close();
		con.close();
		
		

	}

}
