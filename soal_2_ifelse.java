import java.util.Scanner;

public class soal_2_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double b = input.nextDouble();

        if (operator == '+') {
            System.out.println("Hasil: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Hasil: " + (a / b));
            } else {
                System.out.println("Tidak bisa dibagi nol.");
            }
        } else if (operator == '%') {
            if (b != 0) {
                System.out.println("Hasil: " + (a % b));
            } else {
                System.out.println("Tidak bisa dibagi nol.");
            }
        } else {
            System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}