package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement1 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan bir say� isteyin ve say�n�n
		// tek veya �ift say� oldu�unu yazd�r�n
		
		
		Scanner scan = new Scanner(System.in);
		
		
				
		System.out.println("l�tfen bir tamsay� giriniz.");
		
		int sayi= scan.nextInt();
		
			// 153 % 2 == 0 ise bu say� �ift 
			// 153 � 2 == 1 ise bu say� tek
		
		if (sayi%2==0) {
			System.out.println("girdi�iniz say� �ift say�d�r");
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girdi�iniz say� tek say�d�r");
		}
		
		System.out.println(sayi%2);
		System.out.println("kat�ld���n�z i�in te�ekk�r ederiz");
		
		
		scan.close();
		
		
		
	}
}
