import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		String username  = "user01";
		String password  = "user01";
		String db  = "user01";

		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch (Exception e) {
			System.err.println("Can't find driver");
			System.exit(1);
		}

		// format "jdbc:mysql://[hostname][:port]/[dbname]"
		String urlString = "jdbc:mysql://sql.cs.usfca.edu/"+db;
		Connection con = DriverManager.getConnection(urlString,
				username,
				password);
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery (
				"SELECT * " + 
				"FROM customers;");


		while ( result.next() ) {
			String res = result.getString("name");
			System.out.println(res);
		}

		stmt.executeUpdate("INSERT INTO customers (name) VALUES (\"Bob\")");
		System.out.println("***");
		result = stmt.executeQuery (
				"SELECT * " + 
				"FROM customers;");


		while ( result.next() ) {
			String res = result.getString("name");
			System.out.println(res);
		}

		con.close();
	}
}

