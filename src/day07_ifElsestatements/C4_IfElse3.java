package day07_ifElsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan ya��n� sorun
		// 65'den b�y�kse "Emekli olabilirsin" yoksa "emekli olamazs�n" yazd�r�n
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ya��n�z� giriniz?");
		
		int yas= scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
		} else {
			System.out.println("Emekli olamazs�n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
	
}
