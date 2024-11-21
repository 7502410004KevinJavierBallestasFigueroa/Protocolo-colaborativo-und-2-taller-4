package Ejercicio2;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int valor){
        if (valor >= 0){
            setVelocidadMaxima(getVelocidadMaxima()+valor);
            System.out.println("La velocidad es ahora de: "+getVelocidadMaxima() + "km/h");
        }else {
            System.out.println("Ingrese una aceleración positiva");
        }
    }

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + "]";
    }
    
    
}
