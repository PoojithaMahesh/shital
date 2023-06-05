package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
	Statement statement=connection.createStatement();
	statement.executeQuery("select * from User where id=2");
	connection.close();
	System.out.println("selected");
	
}
}
