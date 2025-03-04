package biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una biblioteca con una coleccion de libros y nos
 * permite añadir, borrar y buscar libros por título y por autor
 *
 * @see Libro
 * @author Manuel Marcote
 * @version 4.3.2025
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Banco de libros de la biblioteca */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de la biblioteca */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor con parámetros que permite agregar una lista de libros
     * a la biblioteca
     * @param libros Lista de libros con los que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    /**
     * Metodo que permite agregar un Libro a nuestro banco de libros
     *
     * @param libro Un libro que queramos agregar
     * @return {@code true} si se ha añadido un libro o {@code false} si no se ha añadido
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     * Metodo que permite eliminar un Libro de nuestro banco de libros
     *
     * @param libro Un libro que queramos eliminar
     * @return {@code true} si se ha borrado un libro del banco o {@code false} si no se ha eliminado
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Metodo que nos da la lista de libros que tenemos en nuestra biblioteca
     *
     * @return List Lista con los libros de nuestra biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Metodo que nos permite encontrar un libro a partir de su titulo
     *
     * @param titulo Título del libro a buscar
     * @return {@code libro} si se encuentra en nuestro banco o {@code null} si no se encuentra
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**
     * Metodo que permite encontrar un unico libro de un autor en nuestra biblioteca
     *
     *
     * @param autor Autor del libro que queremos encontrar
     * @return {@code Libro libro} pero nos dara el libro que primero encuentre al recorrer la lista
     * @deprecated Este metodo esta obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Este metodo permite encontrar los libros que pertenecen a un autor
     *
     * @param autor Autor de la serie de libros a buscar
     * @return {@code List<Libro> librosAutor} Lista de libros del autor o {@code null}
     * @since 2.0
     * Sustituto del metodo {@link #encuentaLibroPorAutor(String)}
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
