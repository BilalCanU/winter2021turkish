package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
	
		//kullan�c�dan bir dikd�rtgenin iki kenar uzunlu�unu al�n
		// kenar uzunluklar� e�it ise "kare"
		// e�it de�ilse "dikd�rtgen" yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen dikd�rtgenin iki kenar�n� giriniz");
		
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2 ) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikd�rtgen");
		}
				
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("L�tfen ge�erli bir uzunluk giriniz.");
		}
		
		
		
		// bug : yaz�l�mdaki hatalara denir
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
