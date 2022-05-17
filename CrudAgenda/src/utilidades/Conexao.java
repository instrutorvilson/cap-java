package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection conectar() {
		Connection con = null;
		//           "jdbc:postgresql://host:port/database"
		String url = "jdbc:postgresql://ec2-44-196-223-128.compute-1.amazonaws.com:5432/d6o3obgspnp4ar";
		String user = "djkuyzbwqzcclh";
		String password = "8a19964a6d49186995ed238d1b530eb0449d8c3a6b597caf53ec44d404534d89";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
