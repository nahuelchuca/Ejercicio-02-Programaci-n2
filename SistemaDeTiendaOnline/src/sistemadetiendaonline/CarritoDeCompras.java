package sistemadetiendaonline;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto prod){
        productos.add(prod);
    }
    
    public void mostrarCarrito(){
        for(Producto prod : productos){
            prod.mostrarDatos();
            System.out.println("");
        }
    }
    
    public double calcularTotal(){
        double acumulador = 0;
        for(Producto prod : productos){
            acumulador += prod.calcularPrecioFinal();
        }
        return acumulador;
    }
}
