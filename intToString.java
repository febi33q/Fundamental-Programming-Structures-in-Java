import java.util.Scanner;

public class intToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cetak header dari output
        System.out.println("================================");

        // Buat array untuk menyimpan input
        String[] strings = new String[3];
        int[] integers = new int[3];

        // Loop untuk menerima tiga baris input
        for (int i = 0; i < 3; i++) {
            // Minta input string dan integer dari pengguna
            System.out.println("Masukkan string dan integer (pisahkan dengan spasi):");
            strings[i] = sc.next();  // Baca string
            integers[i] = sc.nextInt();   // Baca integer
        }

        // Cetak hasil setelah semua input dikumpulkan
        for (int i = 0; i < 3; i++) {
            // Cetak string dalam huruf kecil dan integer dengan padding nol
            System.out.printf("%-15s%03d%n", strings[i].toLowerCase(), integers[i]);
        }

        // Cetak footer dari output
        System.out.println("================================");

        sc.close();  // Tutup Scanner
    }
}
