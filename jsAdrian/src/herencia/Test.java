package herencia;

public class Test {
	public static void main(String[] args) {
		
		/* Persona p = new Persona(555, " Mapache","50304", "san lo");
		 p.setDireccion("San Lorenzo");
		 System.out.println("Objeto persona \n"+p);*/
		 Persona a = new Alumno(555, " Mapache",50304, "san lo"," 4564");
		 System.out.println(a);
		 Profesor pr = new Profesor(555, " Mapache",50304, "san lo"," Ingle");
		 System.out.println(pr);
	}
}
