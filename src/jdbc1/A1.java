package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class A1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////	1.Load and Register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//// 2.Create Connection
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
//// 3.Create Statement
//		Statement statement = connection.createStatement();
//// 4.ExecuteQuery
//		boolean result=statement.execute("insert into User values(3,'Ashwini','Jalgaon')");
//		System.out.println(result);
//// 5.Close the connection
//		connection.close();
//		System.out.println("done");
		
//		1.Load and Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

	// 2.Create Connection
			Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
	// 3.Create Statement
			PreparedStatement preparedStatement= connection1.prepareStatement("insert into User values(10,'Ashwini','Jalgaon')");
	// 4.ExecuteQuery
			boolean result1=preparedStatement.execute();
			System.out.println(result1);
	// 5.Close the connection
			connection1.close();
			System.out.println("done");
		}
		
		
		
	}

