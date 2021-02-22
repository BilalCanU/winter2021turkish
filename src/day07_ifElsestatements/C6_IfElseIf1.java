package day07_ifElsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 100 üzerinden notunu isteyin. not'u harf sistemine çevirip yazdýrýn
		// 50'den küçükse "D", 50-60 arasý "C", 60-80 arasý "B", 80'in üzerinde ise "A" yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu sayý olarak giriniz");
		
		double not = scan.nextDouble();
		
		
		if (not<0 || not>100) { // istenmeyen durum
			System.out.println("Lütfen geçerli bir not giriniz");
		} else if (not<50) { 		// notumuz 0<= not <=100 yani 0 ile 100 arasýnda
				System.out.println("Notunuz : D");
		} else if (not<60) {		// notumuz 50-60 arasýnda
				System.out.println("Notunuz : C");
		} else if (not<80) {		// notumuz 60-80 arasýnda
			System.out.println("Notunuz : B");
		} else {					// notumuz 80-100 arasýnda
			System.out.println("Notunuz : A");
			System.out.println("Tebrikler");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
