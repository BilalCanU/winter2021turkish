package day10_SwitchCase;

import java.util.Scanner;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		//  kullan�c�dan bir say� al�n�z 
		// say� �ift ise "�ift" yazd�r�n
		// de�ilse say�n�n karesini yazd�r�n
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int sayi=scan.nextInt();
		
		// e�er ternary'de iki durum i�in farkl� data tipleri d�n��� oluyorsa 
		// ya variable'a atama yapmadan direk yazd�r�r�z
		// ya da m�mk�nse sonu�lar� ayn� data tipine �evirmeye �al���r�z.
		
		System.out.println((sayi%2==0 ? "�ift":sayi*sayi));		
		String sonuc=sayi%2==0 ? "�ift" : sayi*sayi*sayi+"";
		System.out.println(sonuc);	
		scan.close();
		
	}
}
