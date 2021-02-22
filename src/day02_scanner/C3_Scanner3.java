package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		// Kullanýcýdan ismini ve soyismini alýp aralarýnda bir boþluk býrakarak 
		// isim ve soyisim yazdýrma
		
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýsiminizi giriniz:");
		
		String name=scan.nextLine(); // sadece next() seçilirse kullanýcý birden fazla kelime girse bile ilk kelimeyi alýr
		
		System.out.println("Lütfen soyisminizi giriniz:");
		String surname= scan.nextLine();
		
		System.out.println(name+" "+surname);
		
		scan.close();
		
		
		
	}

}
