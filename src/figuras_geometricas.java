public class figuras_geometricas {
    public class FiguraGeometrica {
        private String nombre;
        private String color;

        public FiguraGeometrica(String nombre, String color) {
            this.nombre = nombre;
            this.color = color;
        }

        public void establecerNombre(String nombre) {
            this.nombre = nombre;
        }

        public String obtenerNombre() {
            return nombre;
        }

        public void establecerColor(String color) {
            this.color = color;
        }

        public String obtenerColor() {
            return color;
        }

        // Métodos a implementar por las subclases
        public double calcularArea() {
            return 0.0;  // Cada subclase implementará su propio cálculo de área
        }

        public double calcularPerimetro() {
            return 0.0;  // Cada subclase implementará su propio cálculo de perímetro
        }
    }
    public class Rectangulo extends FiguraGeometrica {
        private double longitud;
        private double ancho;

        public Rectangulo(String nombre, String color, double longitud, double ancho) {
            super(nombre, color);
            this.longitud = longitud;
            this.ancho = ancho;
        }

        @Override
        public double calcularArea() {
            return longitud * ancho;
        }

    }
    public class Main {
        public static void main(String[] args) {
            Rectangulo rectangulo = new Rectangulo("Rectángulo", "Azul", 5.0, 3.0);
            Circulo circulo = new Circulo("Círculo", "Rojo", 4.0);
}
