import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
System.out.println("Masukkan bilangan : ");
int bilangan = input.nextInt();
if (bilangan % 2 ==0 ){
    System.out.println("Ini adalah bilangan genap");
}else{
    System.out.println("Ini adalah bilangan ganjil");
}           input.close();
     
    }
}