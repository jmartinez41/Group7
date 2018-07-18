//This code is for selecting information of any movie in database by its title.
//This should be connected with GUI in Tester.

import java.sql.*;
import java.sql.PreparedStatement;

public class Movie {

	private static String title;
	private static Connection con;


	public Movie(String t) {
		this.title = t;
	}
	//get method;
	public String getTitle() {
		return title;
	}
	//set method;
	public void setTitle(String t) {
		title = t;
	}

	public static void connectDatabase() throws SQLException, ClassNotFoundException {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MovieTheater?serverTimezone=UTC&autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "password";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url,user,password);
			if(!con.isClosed()) {
				System.out.println("Successfully conncet to database.");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry, can't find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Database Connected!");
		}


	}

	public static void getInfoFromTable() throws SQLException {

		PreparedStatement pstmt;
		String sql = "SELECT dotw, tod FROM showings WHERE movie = ?";
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1,title);
		
		ResultSet rs = pstmt.executeQuery();

		System.out.println("show as follow:");
		String dotw = null; 
		String tod = null;

		while(rs.next()) {

			dotw = rs.getString("dotw");
			tod = rs.getString("tod");
			System.out.println(dotw + "\t" + tod);
		}		        
				
	}

}
