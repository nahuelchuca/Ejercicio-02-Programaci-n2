package sistemadetallermecanico;

public class Vehiculo {

    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca
                + "\nModelo: " + modelo);
    }
}
