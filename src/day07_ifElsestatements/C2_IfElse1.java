package day07_ifElsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		
		
		
		// kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n
		// uzunluklar e�it ise kare, kare de�il yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikd�rtgenin 2 kenar�n�n uzunlu�unu giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
				System.out.println("Kare de�il");
			}
			
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
				
		
	}

}
