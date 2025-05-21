package sistemadetiendaonline;

public class Main {

    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        
        carrito.agregarProducto(new Electrodomestico("A",100,"B"));
        carrito.agregarProducto(new Electrodomestico("C",101,"D"));
        carrito.agregarProducto(new Ropa("E",102,"F",10));
        carrito.agregarProducto(new Ropa("G",103,"H",20));
        
        System.out.println("Productos del carrito:\n");
        carrito.mostrarCarrito();
        
        System.out.println("Total de la compra: " + carrito.calcularTotal());
    }

}
