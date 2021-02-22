package day07_ifElsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		
		
		
		// kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn
		// uzunluklar eþit ise kare, kare deðil yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikdörtgenin 2 kenarýnýn uzunluðunu giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
				System.out.println("Kare deðil");
			}
			
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
				
		
	}

}
