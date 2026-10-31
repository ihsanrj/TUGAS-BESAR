package Soal1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM DATA BUKU ===");
        
        // Inisialisasi minimal 2 objek Buku
        Buku buku1 = new Buku("B001", "Pemrograman Java Dasar", "Budi Santoso", 85000.0);
        Buku buku2 = new Buku("B002", "Struktur Data & Algoritma", "Ani Wijaya", 120000.0);

        // Menampilkan data
        buku1.tampilData();
        buku2.tampilData();
    }
}