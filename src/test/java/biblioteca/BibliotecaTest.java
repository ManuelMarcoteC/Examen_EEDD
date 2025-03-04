package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de los metodos de la biblioteca
 *
 * @see Biblioteca
 * @author Manuel Marcote
 * @version 4.3.2025
 */
class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        libro = new Libro("El arte de la guerra", "Tsun Tzu", 0);

        biblioteca = new Biblioteca();
    }

    /**
     * Test del metodo {@code agregarLibro()} pasándole un libro por parametro
     */
    @Test
    void agregarLibro() {
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.agregarLibro(libro));
    }

    /**
     * Test del metodo {@code eliminarLibro()} pasándole un libro por parametro
     */
    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.agregarLibro(libro));

        biblioteca.eliminarLibro(libro);

        assertTrue(biblioteca.eliminarLibro(libro));
    }

    /**
     * Test del metodo {@code encuentraLibroPorTitulo()} agregando un libro a la lista y viendo
     * que es el mismo objeto
     */
    @Test
    void encuentraLibroPorTitulo() {

        biblioteca.agregarLibro(libro);
        assertEquals(libro, biblioteca.encuentraLibroPorTitulo("El arte de la guerra"));

    }

    /**
     * Test del metodo {@code encuentraLibrosPorAutor()} agregando un segundo libro a la lista y viendo
     * que hay dos objetos
     */
    @Test
    void encuentraLibrosPorAutor() {

        Libro libro2 = new Libro("Uno cualquiera", "Tsun Tzu", 0);
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        assertEquals(2, biblioteca.encuentraLibrosPorAutor("Tsun Tzu").size());
    }
}