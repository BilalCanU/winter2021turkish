package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ismini isteyip ilk harfini b�y�k harf olarak yazd�r�n
		// Bilal ==> Ba� Harfiniz : B
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �sminizi giriniz:");
		
		char ilkharf = scan.next().toUpperCase().charAt(0);
		
		// String'de harflerin indexleri 0'dan ba�lar
		// Biz ilk harfi almak istedi�imiz i�in index olarak 0(s�f�r) girmeliyiz.
		
		// e�er charAt(0) yazd�ktan sonra .(nokta) koyarsak methodlar gelmez
		// ��nk� charAt(0) methodu kullan�nca variable'�m�z� char yapm�� oluruz
		// char primitive data tipindendir ve
		// primitive data tipleri method'lara sahip de�ildir
		
		
		// String'de harflerin indexleri 0'dan ba�lar
		// Biz ilk harfi almak istedi�imiz i�in index olarak 0(s�f�r) girmeliyiz.
		
		System.out.println("Ba� harfiniz :" + ilkharf);
		
		
		scan.close();
		
	}
	
	
	
	
}
