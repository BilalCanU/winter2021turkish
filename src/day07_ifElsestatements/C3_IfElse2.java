package day07_ifElsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		
		
		// kullanıcıdan bir karakter girmesini isteyin
		// harf olup olmadığını yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir karakter giriniz.");
		
		char karakter = scan.next().charAt(0);
		
		if ((karakter >= 'a' && karakter <='z') || (karakter >= 'A' && karakter <='Z' )) {
			System.out.println("Girdiğiniz karakter Harf");
		} else {
			System.out.println("Girdiğiniz karakter Harf değildir");
			}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
