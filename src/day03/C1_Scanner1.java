package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		// Kullanýcýdan isim ve soyismini isteyip
		// Ýsim: Bilal Can 
		// Soyisim: Ünal
		// Kursumuza kaydýnýz alýnmýþtýr, teþekkür ederiz.
		
		// Scanner : Kullanýcýdan bilgi almak için kullanýyoruz
		// 3 adýmda iþlemi tamamlýyoruz
		// 1. Adým Scanner objesi oluþturuyorduk
		// Scanner'ýn çalýþmasý için java.util(utulities) kütüphanesinden ilgili 
		// kýsmý classýmýza import etmeliyiz...
		
		
		
		Scanner scan = new Scanner(System.in);
		
		// 2. adým kullanýcýya ne istediðimizi belirten bir mesaj yazmalýyýz
		
		
		System.out.println("Lütfen sadece Ýsminizi giriniz:");
		
		// 3. adým bir variable oluþturup kullanýcýnýn girdiði deðeri atayacaðýz
		
		String name = scan.nextLine();
		
		System.out.println("Lütfen sadece soyisminizi giriniz:");
		
		//String surname = scan.nextLine(); bu þekilde yazarsak
		//sadece ilk kelimeyi alýr sonrakileri almaz
		
		String surname = scan.nextLine();
		
		
		
		// Benden istenen þekilde çýktýyý yazdýrabilirim.
		// eðer yazdýracaðýmýz yazý sabit bir yazý ise çift týrnak arasýnda (" ") yazdýrýyoruz
		// eðer bir variable'a atanmýþ deðeri yazdýrmak istersek
		// " " olmadan sadece variable ismini yazýyoruz
		
		System.out.println("Ýsminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		System.out.println("Kursumuza kaydýnýz alýnmýþtýr, teþekkür ederiz.");
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
