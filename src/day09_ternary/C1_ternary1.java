package day09_ternary;

import java.util.Scanner;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int sayi=scan.nextInt();
			// ternary i�lemi bir sonu� d�nd�rd���nden bir variable olu�turup ona assign etmeliyiz
		String sonuc=sayi%2==0 ? "�ift Say�" : "Tek Say�"; // �f yerine alternatif kullan�lan sat�r
		
		System.out.println(sonuc);
		
		
		// ben bir variable'a assign etmek istemezsem
		// syso i�ine yazabilirim.
		
		
		System.out.println(sayi%2==0 ? "�ift Say�" : "Tek Say�");
		
		// ba��na a��klama yazmak istersem 
		// ternary operat�r�n� parantez i�ine almayal�y�m
		
		System.out.println("��lem sonucu : "+(sayi%2==0 ? "�ift Say�" : "Tek Say�"));
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}
}
