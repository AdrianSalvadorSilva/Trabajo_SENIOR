package biblioSystem;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroController {
public LibroController() {
	super();
	
}
public void save(Libro libro) throws SQLException, ClassNotFoundException {
	String sql="insert into libro values(?,?,?,?,?,?);"; 
	Conexion conexion = new Conexion();
PreparedStatement ps = conexion.getConexion().prepareStatement(sql);
		ps.setInt(1, libro.getCodigo());
		ps.setString(2, libro.getAutor());
		ps.setString(3, libro.getTitulo());
		ps.setInt(4, libro.getAnos());
		ps.setString(5, libro.getEstado());
		ps.setString(6, libro.getEditorial());
	}
}	
