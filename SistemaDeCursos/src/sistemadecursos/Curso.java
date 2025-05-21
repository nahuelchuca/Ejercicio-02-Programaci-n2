package sistemadecursos;

public class Curso {
    private final String nombreCurso;
    private final int duracion;

    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public String getinfoCurso(){
        return nombreCurso + "\nDuracion: " + duracion + " minutos";
    }
}
