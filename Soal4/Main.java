package Soal4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM ANTREAN PEMERIKSAAN KLINIK ===");

        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan("P001", "Ahmad Dahlan", "Dr. Siska, Sp.A", 150000.0));
        daftarPemeriksaan.add(new Pemeriksaan("P002", "Siti Aminah", "Dr. Budi, Sp.PD", 200000.0));
        daftarPemeriksaan.add(new Pemeriksaan("P003", "Joko Widodo", "Dr. Rian, Umum", 75000.0));

        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
        }
    }
}