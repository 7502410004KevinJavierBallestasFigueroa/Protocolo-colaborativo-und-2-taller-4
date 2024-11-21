package Ejercicio3;
public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", notaPromedio=" + notaPromedio + "]";
    }
}
