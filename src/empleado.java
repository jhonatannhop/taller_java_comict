public class empleado {
    public class Empleado {
        private String nombre;
        private double salarioBase;

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getSalarioBase() {
            return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public double calcularSalario() {
            return salarioBase;  // Implementación genérica para empleados que no tienen reglas específicas
        }
    }
    public class Gerente extends Empleado {
        private double bono;

        public Gerente(String nombre, double salarioBase, double bono) {
            super(nombre, salarioBase);
            this.bono = bono;
        }

        @Override
        public double calcularSalario() {
            return getSalarioBase() + bono;
        }
    }
}
