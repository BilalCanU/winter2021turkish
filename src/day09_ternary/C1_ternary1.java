package day09_ternary;

import java.util.Scanner;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int sayi=scan.nextInt();
			// ternary iþlemi bir sonuç döndürdüðünden bir variable oluþturup ona assign etmeliyiz
		String sonuc=sayi%2==0 ? "Çift Sayý" : "Tek Sayý"; // Ýf yerine alternatif kullanýlan satýr
		
		System.out.println(sonuc);
		
		
		// ben bir variable'a assign etmek istemezsem
		// syso içine yazabilirim.
		
		
		System.out.println(sayi%2==0 ? "Çift Sayý" : "Tek Sayý");
		
		// baþýna açýklama yazmak istersem 
		// ternary operatörünü parantez içine almayalýyým
		
		System.out.println("Ýþlem sonucu : "+(sayi%2==0 ? "Çift Sayý" : "Tek Sayý"));
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
	}
}
