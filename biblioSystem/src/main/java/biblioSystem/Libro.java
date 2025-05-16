package biblioSystem;

public class Libro {
 private int codigo, anos;
 private String autor, titulo, estado, editorial;
public Libro() {
	super();
}
public Libro(int codigo, int anos, String autor, String titulo, String estado, String editorial) {
	super();
	this.codigo = codigo;
	this.anos = anos;
	this.autor = autor;
	this.titulo = titulo;
	this.estado = estado;
	this.editorial = editorial;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getAnos() {
	return anos;
}
public void setAnos(int anos) {
	this.anos = anos;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
@Override
public String toString() {
	return "Libro [codigo=" + codigo + ", anos=" + anos + ", autor=" + autor + ", titulo=" + titulo + ", estado="
			+ estado + ", editorial=" + editorial + "]";
}
}
