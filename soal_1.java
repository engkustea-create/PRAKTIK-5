
import java.util.Scanner;

public class soal_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pesan = "";

        for (int i = 1; i <= 26; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            switch (angka) {
                case 1:
                    pesan += "A";
                    break;
                case 2:
                    pesan += "B";
                    break;
                case 3:
                    pesan += "C";
                    break;
                case 4:
                    pesan += "D";
                    break;
                case 5:
                    pesan += "E";
                    break;
                case 6:
                    pesan += "F";
                    break;
                case 7:
                    pesan += "G";
                    break;
                default:
                    System.out.println("Angka belum diketahui! Masukkan angka kembali.");
                    i--;
                    break;
            }
        }

        System.out.println("Pesan yang telah diuraikan: " + pesan);

        input.close();
    }
}
