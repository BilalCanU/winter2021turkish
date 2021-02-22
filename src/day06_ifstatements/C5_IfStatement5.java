package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
	
		//kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alın
		// kenar uzunlukları eşit ise "kare"
		// eşit değilse "dikdörtgen" yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgenin iki kenarını giriniz");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2 ) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdörtgen");
		}
				
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("Lütfen geçerli bir uzunluk giriniz.");
		}
		
		
		
		// bug : yazılımdaki hatalara denir
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
