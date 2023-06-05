package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateA1 {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "root");
	Statement statement=connection.createStatement();
	boolean res=statement.execute("update User set name='Ashwiniiii' where id=2");
	System.out.println(res);
	connection.close();
	System.out.println("done");
	
}
}
