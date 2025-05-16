package colecciones;

import java.util.HashSet;
import java.util.Set;

public class TipoSet {
public static void main(String[] args) {
	 Set<String> colores = new HashSet<>();
	 colores.add("Rojo");
	 colores.add("Verde");
	 colores.add("ROJO");
	 colores.add("AMARRILO");
	 for(String color : colores) {
		 System.out.println(color);
	 }

}
}
