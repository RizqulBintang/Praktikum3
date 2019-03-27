
package prak1latihan6;
import java.util.Scanner;
public class Prak1latihan6 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int nilai1,nilai2,hasil;
     
     System.out.println("Masukkan integer pertama :");
     nilai1=input.nextInt();
     
     System.out.println("Masukkan integer kedua :");
     nilai2 = input.nextInt();
     
     hasil = nilai1 + nilai2;
     System.out.println("Hasil dari " +nilai1+ "+" +nilai2+ "=" +hasil);
    }
    
}
