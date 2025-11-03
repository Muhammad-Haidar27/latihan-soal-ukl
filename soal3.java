import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan : ");
        int bialngan = input.nextInt();

        int hasil = 1;
        int a = 1;
        while (a <= bialngan) {
            hasil = hasil * a;
            a++;
        }
        System.out.println("Faktorial dari "+ bialngan + " adalah "+hasil);
                input.close();

    }
}