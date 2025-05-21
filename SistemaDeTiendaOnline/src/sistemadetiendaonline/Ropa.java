package sistemadetiendaonline;

public class Ropa extends Producto{
    private double desc;

    public Ropa(String nombre, double precioBase, String marca, double desc) {
        super(nombre, precioBase, marca);
        this.desc = desc;
    }
    
    @Override
    public double calcularPrecioFinal(){
        return precioBase * (1 - desc / 100);
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Descuento: " + desc
                + "%\nPrecio final: " + calcularPrecioFinal());
        
    }
}
