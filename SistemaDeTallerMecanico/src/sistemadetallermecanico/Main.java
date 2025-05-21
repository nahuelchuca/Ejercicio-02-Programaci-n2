package sistemadetallermecanico;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Reparable> vehiculos = new ArrayList<>();
        
        vehiculos.add(new Auto("A","B"));
        vehiculos.add(new Auto("C","D"));
        vehiculos.add(new Moto("E","F"));
        vehiculos.add(new Moto("G","H"));
        
        for(Reparable rep : vehiculos){
            rep.reparar();
        }
    }

}
