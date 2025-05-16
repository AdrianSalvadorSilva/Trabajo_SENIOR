package biblioSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	 private String driver = "com.mysql.cj.jdbc.Driver";
	 private String user ="root";
	 private String pass ="";
	 private String bd ="java_biblioteca";
	 String url ="jdbc:mysql://localhost:3306/" +bd;
	public Connection conexion;
	public Conexion() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conexion = DriverManager.getConnection(url, user, pass);
	}
	public Connection getConexion() {
		return conexion;
	}
	public void closeConexion() throws SQLException {
		conexion.close();
	}
}
