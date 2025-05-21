package sistemadetallermecanico;

public class Moto extends Vehiculo implements Reparable{

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void reparar(){
        System.out.println("\nReparando la moto:");
        mostrarDatos();
    }
}
