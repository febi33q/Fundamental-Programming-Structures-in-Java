import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta input string dari pengguna
        System.out.println("Masukkan kalimat: ");
        String s = input.nextLine();

        // Panggil metode untuk memproses string
        processString(s);

        input.close();  // Tutup Scanner
    }

    // Fungsi untuk memproses string dan menampilkan jumlah serta token-token
    public static void processString(String s) {
        // Gunakan regex untuk split berdasarkan non-alfabet
        String[] tokens = s.split("[^A-Za-z]+");

        // Hitung dan cetak jumlah token yang valid
        int numTokens = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {  // Menghindari token kosong yang mungkin terjadi
                numTokens++;
            }
        }
        System.out.println(numTokens);

        // Cetak setiap token yang valid di baris baru
        for (String token : tokens) {
            if (!token.isEmpty()) {  // Pastikan token bukan string kosong
                System.out.println(token);
            }
        }
    }
}
