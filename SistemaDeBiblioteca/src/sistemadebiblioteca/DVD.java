package sistemadebiblioteca;

public class DVD extends MaterialBiblioteca{
    private int duracionMinutos;

    public DVD(String titulo, String autor, int anioPublicacion, int duracionMinutos) {
        super(titulo, autor, anioPublicacion);
        this.duracionMinutos = duracionMinutos;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("DVD:");
        mostrarDatosBasicos();
        System.out.println("Duracion: " + duracionMinutos + " minutos");
        System.out.println("");
    }
}
