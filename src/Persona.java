
import java.time.LocalDate;

public class Persona {
    // Propiedades privadas
    private String nombre;
    private int edad;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, int edad, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String  nombre, int edad) {
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para fecha de nacimiento
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    // Setter para fecha de nacimiento
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    // Método para establecer el nombre
    public void establecerNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    public void establecerEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
    public void establecerFechaNacimiento(LocalDate fechaDeNacimiento) {
        if (fechaDeNacimiento == null || fechaDeNacimiento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser futura o nula");
        }
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    // Método para calcular la fecha de nacimiento a partir de la edad
    public void calcularFechaNacimiento() {
        LocalDate today = LocalDate.now();
        this.fechaDeNacimiento = today.minusYears(this.edad);
    }
}


