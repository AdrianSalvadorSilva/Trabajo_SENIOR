package repaso;

public class Tarea {
private String titulo;
private Estado estado;
public Tarea(String titulo, Estado estado) {
	super();
	this.titulo = titulo;
	this.estado = estado;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public Estado getEstado() {
	return estado;
}
public void setEstado(Estado estado) {
	this.estado = estado;
}
@Override
public String toString() {
	return "Tarea [titulo=" + titulo + ", estado=" + estado + "]";
}


}
