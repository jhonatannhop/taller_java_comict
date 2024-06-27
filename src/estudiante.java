public class estudiante extends Persona {

    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grado: " + grado;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Grado: " + grado;
    }
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);  // Llama al constructor de la clase base (Persona)
        this.grado = grado;   // Inicializa la propiedad propia (grado)
    }
}

