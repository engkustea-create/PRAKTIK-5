
import java.util.Scanner;

public class soal_6 {
    public static void main(String[] args) {
        double average;
        int daysAbsent;
        boolean exempt = false;

        Scanner reader = new Scanner(System.in);

        System.out.println("Program ini akan menentukan apakah Anda lulus dari ujian akhir.");
        System.out.println("Silakan jawab pertanyaan-pertanyaan berikut.");

        System.out.println("Berapa rata-rata nilai Anda di kelas?");
        average = reader.nextDouble();

        System.out.println("Berapa banyak pertemuan kelas yang telah Anda lewatkan pada semester terakhir?");
        daysAbsent = reader.nextInt();

        if ((average >= 90 && daysAbsent <= 3) ||
            (average >= 80 && daysAbsent == 0)) {
            exempt = true;
        }

        if (exempt)
            System.out.println("Selamat! Anda lulus dari ujian akhir.");
        else
            System.out.println("kamu tidak lulus dari ujian akhir.");

        reader.close();
    }
}
