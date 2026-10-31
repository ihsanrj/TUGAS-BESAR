package Soal2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM RENTAL SEPEDA ===");

        Sepeda sepeda1 = new Sepeda("SPD01", "Sepeda Gunung", 3, 15000.0);
        Sepeda sepeda2 = new Sepeda("SPD02", "Sepeda Listrik", 2, 25000.0);

        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}