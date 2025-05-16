package carritocompra;

public class TesteCarrito {
	public static void main(String[] args) {
		Producto p1= new Producto();
		 p1.nombre= "lavadora";
		 p1.marca ="sachun";
		 p1.precio = 1.500 ;
		 p1.decripcion ="lavadora samgung 19Kg";
		 
		ItemCarrito ic = new ItemCarrito();
		ic.producto = p1;
		ic.cant =6;
		
		Carrito miCarrito = new Carrito();
		miCarrito.itemCarrito = ic;
		System.out.println(" Mi Carrito");
		System.out.println("Producto: "+ miCarrito.itemCarrito.producto.nombre);
		int precio = miCarrito.itemCarrito.cant;
		int cant = miCarrito.itemCarrito.cant;
		System.out.println(" Precio: "+precio);
		System.out.println(" Cantida: "+cant);
		System.out.println(" Total: "+(precio * cant));



		
	}

}
