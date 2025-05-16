package herencia;

public class Profesor extends Persona {
private String Especialidad;
public Profesor() {
	super();
}


public Profesor(int cI, int telef, String nombre, String direccion, String e) {
	super(cI, telef, nombre, direccion);
	 this.Especialidad = e;
}

public String getEspecialidad() {
	return Especialidad;
}
public void setEspecialidad(String especialidad) {
	Especialidad = especialidad;
}
@Override
public String toString() {
	return "Profesor [Especialidad=" + Especialidad + "]";
}

}
