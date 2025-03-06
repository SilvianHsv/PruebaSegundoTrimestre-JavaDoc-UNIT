public class Libro {
    /**
     * ESTE CLASE REPRESENTA UNA LIBRO QUE TIENE UN TITULO , UN AUTOR
     * Y EL AÑO DE PUBLICACION
     * @author HOROIU SILVIAN VIRGIL
     * @version 1.0
     */

    /**
     * ATRIBUTOS DE LA CLASE LIBRO
     */
        private String titulo;
        private String autor;
        private int anioPublicacion;

    /**
     * CONSTRUCTOR VACIO DE LA CLASE LIBRO
     */
      private Libro() {}

    /**
         * EL CONSTRUCTOR CON TODO, PARA CREAR EL LIBRO.
         *
         * @param titulo              REPRESENTA EL TITULO DEL LIBRO.
         * @param autor               REPRESENTA EL AUTOR DEL LIBRO
         * @param anioPublicacion     REPRESENTA EL AÑO DE LA PUBLICACION DEL LIBRO
         */
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }

    /**
     *
     * LOS GETTER AND SETTER DE LA CLASE LIBRO
     */
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

    /**
     * toString
     *
     */
        @Override
        public String toString() {
            return titulo + " - " + autor + " (" + anioPublicacion + ")";
        }
    }

