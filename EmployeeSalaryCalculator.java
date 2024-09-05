import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konstanta
        double salary = 500000;  // Gaji pokok per bulan
        double item_price = 50000;    // Harga setiap item
        int min_itemBonus = 40; // Minimal item untuk bonus penjualan 25%
        int min_itemhighBonus = 80; // Minimal item untuk bonus penjualan 35%
        int min_itemFine = 15;  // Minimal item untuk denda
        double bonus_low = 0.25;  // Persentase bonus penjualan jika menjual 40 - 80 item
        double bonus_high = 0.35; // Persentase bonus penjualan jika menjual lebih dari 80 item
        double bonus_per_item = 0.10; // Bonus 10% setiap item
        double denda_percentage = 0.15;  // Persentase denda dari kekurangan item ke 15

        // Input dari pengguna
        System.out.print("Masukkan jumlah item yang terjual: ");
        int itemsSold = sc.nextInt();

        // Perhitungan total penjualan
        double totalSales = itemsSold * item_price;

        // Perhitungan bonus penjualan
        double salesBonus = 0;
        double fine = 0;

        if (itemsSold >= min_itemhighBonus) {
            salesBonus = totalSales * bonus_high; // Bonus 35% jika lebih dari 80 item
        } else if (itemsSold >= min_itemBonus) {
            salesBonus = totalSales * bonus_low;  // Bonus 25% jika antara 40 dan 80 item
        } else if (itemsSold >= min_itemFine) {
            salesBonus = itemsSold * item_price * bonus_per_item; // Bonus 10% per item jika lebih dari 15 item tapi kurang dari 40
        } else {
            // Jika kurang dari 15 item, hitung denda
            int missingItems = min_itemFine - itemsSold;
            fine = missingItems * item_price * denda_percentage;
        }

        // Perhitungan gaji bersih
        double netSalary = salary + salesBonus - fine;

        // Menampilkan hasil
        System.out.println("Total gaji yang diterima: " + (int)netSalary);

        sc.close();  // Menutup scanner
    }
}
