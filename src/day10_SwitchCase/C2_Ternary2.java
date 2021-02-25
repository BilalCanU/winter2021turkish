package day10_SwitchCase;

import java.util.Scanner;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		//  kullanýcýdan bir sayý alýnýz 
		// sayý çift ise "çift" yazdýrýn
		// deðilse sayýnýn karesini yazdýrýn
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int sayi=scan.nextInt();
		
		// eðer ternary'de iki durum için farklý data tipleri dönüþü oluyorsa 
		// ya variable'a atama yapmadan direk yazdýrýrýz
		// ya da mümkünse sonuçlarý ayný data tipine çevirmeye çalýþýrýz.
		
		System.out.println((sayi%2==0 ? "çift":sayi*sayi));		
		String sonuc=sayi%2==0 ? "çift" : sayi*sayi*sayi+"";
		System.out.println(sonuc);	
		scan.close();
		
	}
}
