package sistemadebiblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();

        materiales.add(new Libro("A", "B", 2000, "123"));      
        materiales.add(new Revista("C", "D", 2001, 100));
        materiales.add(new DVD("E", "F", 2002, 200));

        for (MaterialBiblioteca material : materiales) {
            material.mostrarInformacion();
        }
    }

}
