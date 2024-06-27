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
    public class Empleado extends Persona implements Trabajador {
        private String cargo;

        public Empleado(String nombre, int edad, String cargo) {
            super(nombre, edad);
            this.cargo = cargo;
        }

        @Override
        public void realizarTarea() {
            System.out.println("Realizando tarea laboral");
        }

        @Override
        public String toString() {
            return super.toString() + ", Cargo: " + cargo;
        }
    }
}
