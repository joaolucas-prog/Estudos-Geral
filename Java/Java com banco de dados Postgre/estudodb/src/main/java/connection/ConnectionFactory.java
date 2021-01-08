package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/estudos";
	private static final String USER = "postgres";
	private static final String PASSWORD = "0101";
	
	public static Connection getConecction() {
		
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (Exception e ) {
			throw new RuntimeException("Erro na conexão", e);
		}
	}
	
	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void closeConnection(Connection con , PreparedStatement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con);
	}
	public static void closeConnection(Connection con , PreparedStatement stmt , ResultSet res) {
		if(res != null) {
			try {
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		closeConnection(con, stmt);
	}
}
