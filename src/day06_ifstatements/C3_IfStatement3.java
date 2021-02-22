package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {

		
		// kullan�c�dan g�n isminin ilk harfini isteyin ve
		// harfe uygun olan g�n isimlerini yazd�r�n
		// c ==> cuma,cumartesi
		// s ==> sal�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen g�n isminin ilk harfini yaziniz");
		
		char �lkHarf= scan.next().toUpperCase().charAt(0);
		
		System.out.println("�lk harfi: " + (�lkHarf));
		
		
		if (�lkHarf=='S') {
			System.out.println("Sal�");
		}
		
		if (�lkHarf=='P') {
			System.out.println("Pazar Pazartesi Per�embe");
		}
		
		if (�lkHarf=='�') {
			System.out.println("�ar�amba");
		}
		
		if (�lkHarf=='C') {
			System.out.println("Cuma Cumartesi");
		}
		
		
		if (�lkHarf!='P' && �lkHarf!='S' && �lkHarf!='�' && �lkHarf!='C') {
			System.out.println("L�tfen ge�erli bir harf yaz�n�z.");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}
}
