package Soal3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PENCATATAN MENU KAFE ===");

        Menu menu1 = new Menu("M01", "Nasi Goreng Special", 18000.0, "Makanan");
        Menu menu2 = new Menu("M02", "Es Teh Manis", 5000.0, "Minuman");

        int jumlahPesanan1 = 2;
        int jumlahPesanan2 = 3;

        menu1.tampilMenu();
        System.out.println("Jumlah Pesanan : " + jumlahPesanan1);
        System.out.println("Total Harga    : " + menu1.hitungHarga(jumlahPesanan1));
        System.out.println("--------------------------");

        menu2.tampilMenu();
        System.out.println("Jumlah Pesanan : " + jumlahPesanan2);
        System.out.println("Total Harga    : " + menu2.hitungHarga(jumlahPesanan2));
        System.out.println("--------------------------");
    }
}