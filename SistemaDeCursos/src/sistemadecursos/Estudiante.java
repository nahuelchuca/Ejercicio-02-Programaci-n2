package sistemadecursos;

public class Estudiante extends Persona{
    private final int legajo;
    private final Curso curso;

    public Estudiante(String nombre, String apellido, String DNI, int legajo, Curso curso) {
        super(nombre, apellido, DNI);
        this.legajo = legajo;
        this.curso = curso;
    }
    
    public void mostrarInformacion(){
        System.out.println("\nEstudiante:");
        System.out.println("Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDNI: " + DNI
                + "\nLegajo: " + legajo
                + "\nCurso: " + curso.getinfoCurso());
    }
}
