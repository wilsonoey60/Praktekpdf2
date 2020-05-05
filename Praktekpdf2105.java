import java.util.Scanner;
import java.io.*;
import javax.swing.*;
class Praktekpdf2105 {
  public static void main(String[] args) {
  	Scanner Nama = new Scanner(System.in);
    System.out.print("Nama : ");
    System.out.println(Nama.nextLine());
    System.out.print("Alamat : ");
    double alamat = Nama.nextInt();
    System.out.print("Tipe Pesawat = ");
    double tipepesawat = Nama.nextInt();
    System.out.print("Bayar = ");
    long bayar = Nama.nextInt();
    char karakter1 = 'A';
    char karakter2 = 'B';
    char karakter3 = 'C';
    if(tipepesawat == karakter1) {
   		bayar -= 5000000;
	} 
	else if(tipepesawat == karakter2) {
   		bayar -= 2000000;
	} 
	else if(tipepesawat == karakter3) {
   		bayar -= 1000000;
	}
    System.out.println("Nama =" +Nama);
    System.out.println("Alamat =" +alamat);
    System.out.println("Kembalian =" +bayar);
  }
}