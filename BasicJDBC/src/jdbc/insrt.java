package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insrt {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String query="insert into product(id,name,address) values(1,'Pooja','Kolhapur')";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Hello");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate?user=root&password=1234");
			stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			System.out.println(count+"Record Is Inserted");
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
