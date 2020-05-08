import java.util.Scanner;
import java.io.*;
import javax.swing.*;
class Praktekpdf2105 {
  public static void main(String[] args) {
  	Scanner Input = new Scanner(System.in);
  	String nama, alamat, tipepesawat;

  	int bayar, harga;
    System.out.print("Nama : ");
    nama = Input.nextLine();
    System.out.print("Alamat : ");
    alamat = Input.nextLine();
    System.out.print("Tipe Pesawat : ");
    tipepesawat = Input.nextLine();
    System.out.print("Bayar : ");
    bayar = Input.nextInt();
    String karakter1 = "A";
    String karakter2 = "B";
    String karakter3 = "C";
    
    if(tipepesawat == karakter1) {
   		harga = 5000000;
	} 
	else if(tipepesawat == karakter2) {
   		harga = 2000000;
	} 
	else if(tipepesawat == karakter3) {
   		harga = 1000000;
	}
	harga = Input.nextInt();
    System.out.println("Nama : " +nama);
    System.out.println("Alamat : " +alamat);
    System.out.println("Kembalian : " +(bayar - harga));
  }
}
