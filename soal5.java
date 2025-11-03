import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa : ");
        int siswa = input.nextInt();

        int total = 0;

        int i =1;
        while (i <= siswa){
            System.out.println("Masukkan nilai siswa ke "+i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
            i++;
        }
        double rata = total / siswa;
        System.out.println("Rata-rata nilainya adalah "+rata);
        input.close();
    }
}