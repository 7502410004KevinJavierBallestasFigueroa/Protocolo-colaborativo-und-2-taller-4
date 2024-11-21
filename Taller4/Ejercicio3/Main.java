package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Kevin", 25, 4);
        System.out.println("El nombre del estudiante e1 es: "+e1.getNombre());
        System.out.println("La edad del estudiante e1 es: "+e1.getEdad());
        System.out.println("La nota promedio del estudiante e1 es: "+e1.getNotaPromedio());
    }
}
