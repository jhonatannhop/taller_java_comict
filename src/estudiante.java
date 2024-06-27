public class estudiante extends Persona {

    private String grado;

    public estudiante(String nombre, int edad, String grado) {
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
}

