package herencia;

public abstract class Persona {
	private int CI, telef;
	private String Nombre , direccion;
	public Persona() {
		super();
	}
	public Persona(int cI, int telef, String nombre, String direccion) {
		super();
		CI = cI;
		this.telef = telef;
		Nombre = nombre;
		this.direccion = direccion;
	}
	public int getCI() {
		return CI;
	}
	public void setCI(int cI) {
		CI = cI;
	}
	public int getTelef() {
		return telef;
	}
	public void setTelef(int telef) {
		this.telef = telef;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() > 4) {
			this.Nombre = nombre;
		}
		
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [CI=" + CI + ", telef=" + telef + ", Nombre=" + Nombre + ", direccion=" + direccion + "]";
	}
	
}
