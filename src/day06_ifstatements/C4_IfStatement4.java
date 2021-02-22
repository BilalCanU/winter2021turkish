package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		// kullan�c�dan g�n ismini isteyin
		// girilen g�n�n hafta i�i veya hafta sonu oldu�unu yazd�r�n
		
		// pazar --> haftasonu, sal� --> hafta i�i
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir G�n giriniz");
		
		String gun�smi = scan.next().toLowerCase();
		
		// E�er String'lerde e�itlik sorguluyorsak == kullanmamal�y�z
		// String'lerde e�it olma durumunu sorgulamak i�in equal methodunu kullanmal�y�z
		
		if (gun�smi.equals("cumartesi") || gun�smi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		 
		if (gun�smi.equals("pazartesi") || gun�smi.equals("sal�") || gun�smi.equals("�ar�amba") ||
			gun�smi.equals("per�embe") || gun�smi.equals("cuma")) {
			System.out.println("haftai�i");
		} 
		
		// bu kodda g�n ismi yanl�� yaz�lm��sa olu�acak durum yok.
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
