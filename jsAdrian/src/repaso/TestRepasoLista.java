package repaso;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestRepasoLista {
public static void main(String[] args) {
List<Tarea> tareas = Arrays.asList(
		new Tarea("Estudiante Streams", Estado.PENDIENTE),
		new Tarea("Estudiante Streams", Estado.EN_PROGRESO),
        new Tarea("Estudiante Streams", Estado.COMPLETADA),
		new Tarea("Estudiante Streams", Estado.PENDIENTE),
		new Tarea("Estudiante Streams", Estado.EN_PROGRESO)

);
System.out.println(" Tarea PENDIANTE: ");
tareas.stream()
 .filter(t -> t.getEstado() == Estado.PENDIENTE)
 .map(Tarea:: getTitulo)
 .forEach(System.out::println);
 
 System.out.println("\n Títulos de tareas COMPLETADA");
 tareas.stream()
 .filter(t -> t.getEstado() == Estado.COMPLETADA)
 .map(Tarea:: getTitulo)
 .forEach(System.out::println);
 
 System.out.println("\\n Conteo por estado: ");
 Map<Estado, Long> conteo = tareas.stream()
.collect(Collectors.groupingBy(Tarea::getEstado, Collectors.counting()));
 
 conteo.forEach((estado, Cantidad)->
 System.out.println(estado +" : "+ Cantidad + "tareas")
 );
}
}
enum Estado{
	PENDIENTE,
	EN_PROGRESO,
	COMPLETADA
}