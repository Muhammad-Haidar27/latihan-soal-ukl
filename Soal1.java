import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Kamu mau mengantar berapa paket : ");
int jmlpaket = input.nextInt();
System.out.println("Masukkan jarak paket mu(KM) : ");
int jarak = input.nextInt();
int ongkir = 0;
if (jarak <= 10){
    ongkir = 4250*jmlpaket;
    System.out.println("Ongkir : " +ongkir );
}else if (jarak >10) {
    ongkir = 6000*jmlpaket;
    System.out.println("Onkir : "+ongkir );
}
 System.out.println("Berapa panjang paketmu? (cm³) : ");
 int panjang = input.nextInt();
 System.out.println("Berapa lebar paketmu? (cm³) : ");
 int lebar = input.nextInt();
 System.out.println("Berapa tinggi paketmu? (cm³) : ");
 int tinggi = input.nextInt();
 int volpaket = panjang*lebar*tinggi;
 int biayatambahan = 0;
 if (volpaket >100){
    biayatambahan = 50000*jmlpaket;
    System.out.println("Kamu dikenai biaya tambahan sebesar : "+biayatambahan );
 }else if (volpaket <100) {
    System.out.println("Tidak ada biaya tambahan");
 }

int total = biayatambahan+ongkir;

System.out.println("Total ongkir dari paketmu adalah "+total);
        input.close();

    }
}