import java.util.Scanner;
public class HitungLuas {
    public static void main(String []args){
        int p = 10;
        int l = 8;
        int luas = p*l;
        double luas2;
        int jarijari;
        System.out.print("Luas Persegi panjang bila diketahui Panjang(10 cm) dan Lebar (8 cm) adalah "+luas+" cm");
  	 Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
   jarijari = scan.nextInt();
 
   luas2 = 3.14 * (jarijari * jarijari);
   System.out.println("Luas Lingkaran= " +luas2); 

    }
}
