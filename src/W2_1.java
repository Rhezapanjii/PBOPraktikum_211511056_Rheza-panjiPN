import java.util.Scanner;

public class W2_1 {
  public static void main(String[] args) {
    long n;
    /* untuk input bilangan */
    Scanner scan = new Scanner(System.in);
    System.out.print("cek sebuah bilangan : ");
    n = scan.nextLong();
    /* Pendeklarasian kelompok tipedata byte */
    if (n >= -128 && n <= 127) {
      System.out.print("bilangan merupakan bagian dari tipe data Byte \n");
    }
    /* Pendeklarasian kelompok tipedata short */
     if(n >= -32768 && n <= 3276) {
        System.out.print("bilangan merupakan bagian dari tipe data Short\n");
     							}
     /* Pendeklarasian kelompok tipedata Integer */
     if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
         System.out.print("bilangan merupakan bagian dari tipe data Integer\n");
         /* Pendeklarasian kelompok tipedata long */							 }
     if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
         System.out.print("bilangan merupakan bagian dari tipe data Long\n");
     							 }
     {
       }
	}
		}