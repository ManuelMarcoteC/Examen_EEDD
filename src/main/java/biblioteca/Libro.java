package biblioteca;

/**
 * Clase que representa un libro
 *
 * @see Biblioteca
 * @author Manuel Marcote
 * @version 4.3.2025
 */
public class Libro {

    // TODO: Documentar estos atributos
    /**Establece un titulo*/
    private String titulo;
    /** Establece un autor*/
    private String autor;
    /** Establece un año de publicacion*/
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**
     * Permite construir un Libro por parámetros
     *
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año de publicación
     *
     * Testeado en @see BibliotecaTest
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Permite conseguir el nombre de un autor
     * @return {@code String autor} nos da el nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Nos devuelve el año de publicacion del libro
     *
     * @return {@code inr anioPublicacion}
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
