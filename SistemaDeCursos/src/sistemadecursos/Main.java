package sistemadecursos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Matematica",10);
        Curso curso2 = new Curso("Lenguaje",20);
        Curso curso3 = new Curso("Ingles",30);
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante("A","B","123",100,curso1));
        estudiantes.add(new Estudiante("C","D","456",101,curso2));
        estudiantes.add(new Estudiante("E","F","789",102,curso3));
        
        for(Estudiante estudiante : estudiantes){
            estudiante.mostrarInformacion();
        }
    }

}
