import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    /**
     * ESTA CLASE REPRESENTA UNA BIBLIOTECA CON UNA COLECCION DE LIBROS
     * Representa una biblioteca con una colección de libros.
     * TIENE EL FUNCIONAMIENTO DE AGREGAR Y BUSCAR LIBROS

     * @author HOROIU SILVIAN VIRGIL
     * @version 1.0
     */

        public List<Libro> libros;

        /**
         * CONSTRUCTOR VACIO
         */
        public Biblioteca() {
            this.libros = new ArrayList<>();
        }

        /**
         * AGREGA UN LIBRO A LA BIBLIOTECA
         * @param libro EL LIBRO A AGREGAR .
         */
        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        /**
         * BUSCAMOS UN LIBRO POR SU TITULO.
         *
         * @param titulo EL TITULO DEL LIBRO QUE BUSCAMOS.
         * @return  NOS DEVEULVE EL LIBRO ENCINTRADO O NULL SI NO SE PUEDE ENCONTRAR.
         */

        public Libro buscarLibro(String titulo) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    return libro;
                }
            }
            return null;
        }

        /**
         * LISTAR TODOS LOS LIBROS EN LA BIBLIOTECA.
         *
         * @return   NOS DEVUELVE LA LISTA DE LIBROS EN LA BIBLIOTECA.
         */
        public List<Libro> listarLibros() {
            return libros;
        }
    }


