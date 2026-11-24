import java.util.Scanner;

public class soal_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa di sekolah anda: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Apakah Anda pernah meraih prestasi akademik? (true/false): ");
        boolean prestasi = input.nextBoolean();

        System.out.print("Masukkan GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT: ");
        int sat = input.nextInt();

        if ((prestasi && jumlahSiswa >= 1400) ||
            (gpa >= 4.0 && sat >= 1100) ||
            (gpa >= 3.5 && sat >= 1300) ||
            (gpa >= 3.0 && sat >= 1500)) {

            System.out.println("Mahasiswa diterima di Mountville University.");
        } else {
            System.out.println("Mahasiswa tidak diterima di Mountville University.");
        }

        input.close();
    }
}