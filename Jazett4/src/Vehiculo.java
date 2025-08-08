// Clase base Vehiculo
public abstract class Vehiculo {
    private String marca;     // Encapsulamiento: atributos privados
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void encender();  // Polimorfismo: método abstracto a implementar
}
