package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SampleJdbc {

	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","123456");
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from sampleTable where phoneNo=?");
		
		
		preparedStatement.setInt(1, 123456);
		
		int i = preparedStatement.executeUpdate();
		if(i>0)
		{
			System.out.println("updated");
		}
		else {
			System.out.println("not done");
		}
	}
}
