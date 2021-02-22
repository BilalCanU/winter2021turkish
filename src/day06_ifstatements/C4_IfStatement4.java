package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		
		// kullanıcıdan gün ismini isteyin
		// girilen günün hafta içi veya hafta sonu olduğunu yazdırın
		
		// pazar --> haftasonu, salı --> hafta içi
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Gün giriniz");
		
		String gunİsmi = scan.next().toLowerCase();
		
		// Eğer String'lerde eşitlik sorguluyorsak == kullanmamalıyız
		// String'lerde eşit olma durumunu sorgulamak için equal methodunu kullanmalıyız
		
		if (gunİsmi.equals("cumartesi") || gunİsmi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		 
		if (gunİsmi.equals("pazartesi") || gunİsmi.equals("salı") || gunİsmi.equals("çarşamba") ||
			gunİsmi.equals("perşembe") || gunİsmi.equals("cuma")) {
			System.out.println("haftaiçi");
		} 
		
		// bu kodda gün ismi yanlış yazılmışsa oluşacak durum yok.
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
