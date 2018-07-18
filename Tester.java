//This can be used to test the databaseMovie.java.
//In the same format, we should be able to test other database code file.
//Adding GUI codes should make the final Tester.


import java.sql.*;

public class Tester {
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		Movie movieA = new Movie("A");
		movieA.connectDatabase();
		movieA.getInfoFromTable();
	}
}
