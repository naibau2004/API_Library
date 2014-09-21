package testMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testMySQL {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://172.16.203.51:3306/test";
		String user = "admin";
		String password = "syscom@123";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);

			if (conn != null && !conn.isClosed()) {				

				// SQL statement
				try {
					Statement stat = conn.createStatement();
					ResultSet rs = stat.executeQuery("Select * from user");
					System.out.println("ID\t\tName");
					while (rs.next()) {
						System.out.println(rs.getInt("id") + "\t\t"
								+ rs.getString("name") + "\t\t");
					}
				} catch (SQLException e) {					
					System.out.println("DropDB Exception :" + e.toString());
				} finally {
					conn.close();
				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
