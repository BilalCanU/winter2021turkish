package day09_ternary;

import java.util.Scanner;

public class C4_TernarySoru {
public static void main(String[] args) {
	
	
//	Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin


	Scanner scan= new Scanner(System.in);
	System.out.println("Lütfen bir tam sayý giriniz");
	
	int sayi = scan.nextInt();
	
	System.out.println(sayi%2==0 ? "Çift Sayý":"Tek Sayý");
	
	
	
	// girilen sayýnýn mutlak deðerini yazdýrýnýz
	// 5->5		-12-> 12 (girilensayý x olsun. x pozitifse |x|=x x negatifse |x|=-x
	
	
	System.out.println("Sayýnýn mutlak deðeri : " +(sayi>0 ? sayi:-sayi));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
}
}
