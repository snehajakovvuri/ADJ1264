package programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		String URL = "jdbc:mysql://localhost:3306/adj";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,"root","root");
			System.out.println("Connection Established");
			Statement st = null;
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
			while(rs.next()) {
				int sid = rs.getInt("sid");
				String sname = rs.getString("sname");
				String branch = rs.getString("branch");
				int year = rs.getInt("year");
				System.out.println(sid+" "+sname+" "+branch+" "+year);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
