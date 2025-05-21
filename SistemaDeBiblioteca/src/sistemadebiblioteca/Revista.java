package sistemadebiblioteca;

public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Revista:");
        mostrarDatosBasicos();
        System.out.println("Número de edicion: " + numeroEdicion);
        System.out.println("");
    }
}
