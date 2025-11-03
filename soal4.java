import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double phi = Math.PI;
        System.out.println("Masukkan jari-jari : ");
        int jari = input.nextInt();
        double luasalas = Math.pow(jari, 2);
        System.out.println("Masukkan tinggi : ");
        int tinggi = input.nextInt();
        double hasil = luasalas*phi*tinggi;
        System.out.println("Hasilnya adalah : "+hasil);
                input.close();

    }
}