public class Main {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Yamaha", "MT‑07");

        miAuto.encender();
        miMoto.encender();
    }
}