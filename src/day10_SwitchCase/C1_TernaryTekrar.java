package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		
		// kullanýcýdan bir sayý alýn ve
		// sayý 3 basamaklý pozitif sayý ise "üç basamaklý sayý" , yoksa
		// "üç basamaklý deðil"" yazdýrýn
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir tam sayý giriniz");
		int sayi= scan.nextInt();
		
		String sonuc =sayi>99 ? (sayi<1000 ? "Üç basamaklý" : "üç basamaklý deðil") : "Üç basamaklý deðil";
		
		
		System.out.println((sayi>99 ? (sayi<1000 ? "Üç basamaklý" : "üç basamaklý deðil") : "Üç basamaklý deðil"));
		
		System.out.println(sonuc);
		
		
		
		// nested ternary olmasýn
		
		String sonuc2=sayi>=100 && sayi<1000 || sayi<=-100 && sayi>-1000 ? "üç basamaklý":"üç basamaklý deðil";
		
		System.out.println(sonuc2);
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
