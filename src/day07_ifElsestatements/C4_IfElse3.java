package day07_ifElsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan yaþýný sorun
		// 65'den büyükse "Emekli olabilirsin" yoksa "emekli olamazsýn" yazdýrýn
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yaþýnýzý giriniz?");
		
		int yas= scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
		} else {
			System.out.println("Emekli olamazsýn");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
	
}
