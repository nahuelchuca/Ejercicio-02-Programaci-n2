package sistemadebiblioteca;

public class Libro extends MaterialBiblioteca {
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        super(titulo, autor, anioPublicacion);
        this.isbn = isbn;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Libro:");
        mostrarDatosBasicos();
        System.out.println("ISBN: " + isbn);
        System.out.println("");
    }
}
