package day07_ifElsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 100 �zerinden notunu isteyin. not'u harf sistemine �evirip yazd�r�n
		// 50'den k���kse "D", 50-60 aras� "C", 60-80 aras� "B", 80'in �zerinde ise "A" yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu say� olarak giriniz");
		
		double not = scan.nextDouble();
		
		
		if (not<0 || not>100) { // istenmeyen durum
			System.out.println("L�tfen ge�erli bir not giriniz");
		} else if (not<50) { 		// notumuz 0<= not <=100 yani 0 ile 100 aras�nda
				System.out.println("Notunuz : D");
		} else if (not<60) {		// notumuz 50-60 aras�nda
				System.out.println("Notunuz : C");
		} else if (not<80) {		// notumuz 60-80 aras�nda
			System.out.println("Notunuz : B");
		} else {					// notumuz 80-100 aras�nda
			System.out.println("Notunuz : A");
			System.out.println("Tebrikler");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
