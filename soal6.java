import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka pertama
        System.out.println("Masukkan angka pertama:");
        BigInteger angka1 = new BigInteger(input.next());  // Membaca angka pertama sebagai BigInteger

        // Meminta pengguna untuk memasukkan angka kedua
        System.out.println("Masukkan angka kedua:");
        BigInteger angka2 = new BigInteger(input.next());  // Membaca angka kedua sebagai BigInteger

        // Melakukan penjumlahan
        BigInteger jumlah = angka1.add(angka2);
        System.out.println("Hasil penjumlahan: " + jumlah);

        // Melakukan perkalian
        BigInteger perkalian = angka1.multiply(angka2);
        System.out.println("Hasil perkalian: " + perkalian);

        input.close();  // Menutup scanner
    }
}
