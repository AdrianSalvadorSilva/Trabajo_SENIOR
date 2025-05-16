package herencia;

public class Alumno extends Persona{
private String Matricula;
public Alumno() {
	super();
}

public Alumno(int cI, int telef, String nombre, String direccion) {
	super(cI, telef, nombre, direccion);
	// TODO Auto-generated constructor stub
}

public String getMatricula() {
	return Matricula;
}
public void setMatricula(String matricula) {
	Matricula = matricula;
}
@Override
public String toString() {
	return "Alumno [Matricula=" + Matricula + "]";
}

}
