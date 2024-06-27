public class trabajador {
    public interface Trabajador {
        void realizarTarea();
    }
    public class Estudiante extends Persona implements Trabajador {
        private String grado;

        public Estudiante(String nombre, int edad, String grado) {
            super(nombre, edad);
            this.grado = grado;
        }

        @Override
        public void realizarTarea() {
            System.out.println("Realizando tarea escolar");
        }

        @Override
        public String toString() {
            return super.toString() + ", Grado: " + grado;
        }
    }
}
