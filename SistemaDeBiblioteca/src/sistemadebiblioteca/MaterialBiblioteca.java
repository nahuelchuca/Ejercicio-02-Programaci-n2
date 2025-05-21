package sistemadebiblioteca;

public class MaterialBiblioteca {

    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    protected void mostrarDatosBasicos() {
        System.out.println("Titulo: " + titulo
                + "\nAutor: " + autor
                + "\nAnio de publicacion: " + anioPublicacion);
    }

    public void mostrarInformacion() {
        System.out.println("Material de biblioteca:");
        mostrarDatosBasicos();
    }
}
