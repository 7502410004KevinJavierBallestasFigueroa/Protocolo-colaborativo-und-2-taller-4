
package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Renault", "Sandero", 120);
        System.out.println("Los datos iniciales del coche1 son: "+coche1);
        System.out.println("");
        System.out.println("Modificación de la velocidad");
        coche1.acelerar(12);
        System.out.println("");
        System.out.println("Los datos actualizados del coche1 son: "+coche1);
    }
    
}
