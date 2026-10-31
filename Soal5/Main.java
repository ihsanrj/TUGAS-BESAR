package Soal5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== STRUK PEMESANAN TIKET BIOSKOP ===");
        System.out.println();


        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("TKT01", "Avengers: Endgame", "Regular", 40000.0, 2));
        daftarTiket.add(new Tiket("TKT02", "Avatar: The Way of Water", "IMAX", 75000.0, 3));

            for (Tiket t : daftarTiket) {
            t.tampilData();
        }
    }
}