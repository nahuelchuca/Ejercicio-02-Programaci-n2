package sistemadetallermecanico;

public class Auto extends Vehiculo implements Reparable{
    public Auto(String marca, String modelo){
        super(marca,modelo);
    }
    
    @Override
    public void reparar(){
        System.out.println("\nReparando el auto:");
        mostrarDatos();
    }
}
