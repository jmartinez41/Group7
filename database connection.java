//This is a Connection to database. It can be used in all the java files to connect with database.

import java.sql.*;

public class Conn {
    
  public static void main (String[] args) {
		
    Connection con;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/MovieTheater?serverTimezone=UTC&autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "rootroot";
		
    try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,password);
			
      if(!con.isClosed()) {
				System.out.println("Succeed conncet to database.");
			}
      
			Statement statement = con.createStatement();
			String sql = "select * from Movie";        //This will work for any SQL statement

			ResultSet rs = statement.executeQuery(sql);    
			System.out.println("show as follow:");

			String name = null;   
			String time = null;    

			while(rs.next()) {
				name = rs.getString("NAME");   //This can be replaced by any title of a column
				time = rs.getString("Time");
				System.out.println(name + "\t" + time);
			}
			
      			rs.close();
			con.close();
		
    } catch (ClassNotFoundException e) {
			System.out.println("Sorry, can't find the Driver!");
			e.printStackTrace();
      
		} catch (SQLException e) {
			e.printStackTrace();
      
		} catch (Exception e) {
			e.printStackTrace();
      
		} finally {
			System.out.println("Success!");
		}
	}
}
