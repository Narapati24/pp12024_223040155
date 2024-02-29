package pertemuan2;

public class ContohFungsi {
    // Merupakan Sebuah Procedure yang dimana dia menjalankan pertambahan dari parameter a dan b
    public static int tambah(int a, int b) { return a + b; }

    // Merupakan sebuah Procedure yang dimana dia menjalankan perkalian dari parameter a dan b
    public static int kali(int a, int b) { return a * b; }

    public static void main(String[] args) {
        // memasukan hasil dari penjumlahan procedure tambah 5 dan 3 ke dalam variable hasilPenjumlahan
        int hasilPenjumlahan = tambah(5, 3);
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        // memasukan hasil dari perkalian procedure kali 4 dan 6 ke dalam variable hasilPerkalian
        int hasilPerkalian = kali(4, 6);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        // Hasil Penjumlahan: 8
        // Hasil Perkalian: 24
    }
}
