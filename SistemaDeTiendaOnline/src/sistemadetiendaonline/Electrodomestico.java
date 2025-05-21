package sistemadetiendaonline;

public class Electrodomestico extends Producto{

    public Electrodomestico(String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
    }
    
    @Override
    public double calcularPrecioFinal(){
        return precioBase * 1.21;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Impuesto: " + 21.0 + "%\nPrecio final: " + calcularPrecioFinal());
    }
}
