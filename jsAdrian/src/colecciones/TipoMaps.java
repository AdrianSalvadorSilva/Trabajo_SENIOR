package colecciones;

import java.util.HashMap;
import java.util.Map;

public class TipoMaps {
 public static void main(String[] args) {
	 Map<String, Integer> edades = new  HashMap<>();
	 edades.put("pepe", 1);
	 edades.put("juan", 23);
	 edades.put("blades", 25);
	 edades.put("locho", 31);
 for(String Clave : edades.keySet()) {
	 System.out.println(Clave +" : "+ edades.get(Clave));
 }
 }
}
