import java.util.Scanner;

public class Aritamtika {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memilih operator
        System.out.println("Pilih operator: +, -, *, /, atau %");
        operator = input.next().charAt(0);

        // Meminta pengguna untuk memasukkan angka pertama
        System.out.println("Masukkan angka pertama:");
        number1 = input.nextDouble();

        // Meminta pengguna untuk memasukkan angka kedua
        System.out.println("Masukkan angka kedua:");
        number2 = input.nextDouble();

        switch (operator) {
            // Operasi penjumlahan
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // Operasi pengurangan
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // Operasi perkalian
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // Operasi pembagian
            case '/':
                // Menangani pembagian dengan nol
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                }
                break;

            // Operasi modulus (sisa hasil bagi)
            case '%':
                // Menangani modulus dengan nol
                if (number2 != 0) {
                    result = number1 % number2;
                    System.out.println(number1 + " % " + number2 + " = " + result);
                } else {
                    System.out.println("Operasi modulus dengan nol tidak diperbolehkan!");
                }
                break;

            // Jika operator tidak valid
            default:
                System.out.println("Operator tidak valid!");
                break;
        }

        input.close(); // Menutup scanner
    }
}
