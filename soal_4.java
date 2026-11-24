
import java.util.Scanner;
import java.util.Arrays;

public class soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = input.nextLine();

        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        kata1 = kata1.replaceAll("[^a-zA-Z]", "");
        kata2 = kata2.replaceAll("[^a-zA-Z]", "");

        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        System.out.println("Kata pertama setelah diurutkan: " + new String(huruf1));
        System.out.println("Kata kedua setelah diurutkan: " + new String(huruf2));
        
        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata merupakan anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }

        input.close();
    }
}
