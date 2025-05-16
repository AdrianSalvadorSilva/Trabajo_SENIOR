package colecciones;

import java.util.ArrayList;
import java.util.List;

public class TipoList {
public static void main(String[] args) {
/*	//lista String
	List<String> nombre = new ArrayList();
	//carga tre nombre
	nombre.add("Salavdor");
	nombre.add("Cami");
	nombre.add("Santi");
	nombre.remove(1);
	//imprimir la lista
	System.out.println("Segundo elemento");
	System.out.println(nombre.get(1));
	
	//imprimir la lista completa
	System.out.println("---------------Lista con for each-------------");
	for(int x=0; x< nombre.size(); x++) {
		System.out.println(nombre.get(x));
	}
	
	/*segundo forma para imprimir una Lista 
	 eliminar a cami*/
/*	System.out.println("---------------Lista con for each-------------");
	for(String n : nombre) {
		System.out.println(n);
	}
	*/
	
/*MASCOTAS*/
List<Mascota> mascota = new ArrayList();
mascota.add(new Mascota("Lusifer","metiso",3));
mascota.add(new Mascota("Sancho","doverman",4 ));
mascota.add(new Mascota("Nescle","terrier",1));

for(Mascota m : mascota) {
	System.out.println(m.toString());
}

}
}
