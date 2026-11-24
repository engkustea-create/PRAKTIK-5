
import java.util.Scanner;

public class soal_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tinggi, panjang, lebar;
        double luasDinding, luasPlafon, totalLuas;

        int ember5 = 0, ember1 = 0;
        double biaya, biayaTermurah = Double.MAX_VALUE;

        System.out.print("Masukkan tinggi ruangan: ");
        tinggi = input.nextDouble();

        System.out.print("Masukkan panjang ruangan: ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan: ");
        lebar = input.nextDouble();

        luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        luasPlafon = panjang * lebar;
        totalLuas = luasDinding + luasPlafon;

        int totalLiter = (int) Math.ceil(totalLuas / 300);

        for (int i = 0; i <= totalLiter / 5; i++) {
            int jumlah5 = i;
            int jumlah1 = Math.max(0,
                (int) Math.ceil((totalLuas - jumlah5 * 1500) / 300));

            if (jumlah5 * 1500 + jumlah1 * 300 >= totalLuas) {
                biaya = jumlah5 * 271500 + jumlah1 * 72400;

                if (biaya < biayaTermurah) {
                    biayaTermurah = biaya;
                    ember5 = jumlah5;
                    ember1 = jumlah1;
                }
            }
        }

        System.out.println("\nLuas dinding: " + luasDinding + " kaki persegi");
        System.out.println("Luas langit-langit: " + luasPlafon + " kaki persegi");
        System.out.println("Total luas: " + totalLuas + " kaki persegi");
        System.out.printf("Biaya cat termurah: Rp%,.0f%n", biayaTermurah);

        input.close();
    }
}
