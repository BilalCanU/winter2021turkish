package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {

		
		// kullanýcýdan gün isminin ilk harfini isteyin ve
		// harfe uygun olan gün isimlerini yazdýrýn
		// c ==> cuma,cumartesi
		// s ==> salý
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gün isminin ilk harfini yaziniz");
		
		char ýlkHarf= scan.next().toUpperCase().charAt(0);
		
		System.out.println("Ýlk harfi: " + (ýlkHarf));
		
		
		if (ýlkHarf=='S') {
			System.out.println("Salý");
		}
		
		if (ýlkHarf=='P') {
			System.out.println("Pazar Pazartesi Perþembe");
		}
		
		if (ýlkHarf=='Ç') {
			System.out.println("Çarþamba");
		}
		
		if (ýlkHarf=='C') {
			System.out.println("Cuma Cumartesi");
		}
		
		
		if (ýlkHarf!='P' && ýlkHarf!='S' && ýlkHarf!='Ç' && ýlkHarf!='C') {
			System.out.println("Lütfen geçerli bir harf yazýnýz.");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}
}
