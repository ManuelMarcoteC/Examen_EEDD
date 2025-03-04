package biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase Libro
 *
 * @see Libro
 * @author Manuel Marcote
 * @version 4.3.2025
 */
class LibroTest {

    /**
     * Test del constructor por parámetros de Libro en el que se ve cómo se ha añadido a la
     * biblioteca
     */
    @Test
    void testLibro() {

        Libro libro = new Libro("Así habló Zaratustra", "Friedrich Nietzsche", 1889);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
        assertEquals(libro,biblioteca.encuentraLibroPorTitulo("Así habló Zaratustra") );
    }
}