package day09_ternary;

import java.util.Scanner;

public class C4_TernarySoru {
public static void main(String[] args) {
	
	
//	Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin


	Scanner scan= new Scanner(System.in);
	System.out.println("L�tfen bir tam say� giriniz");
	
	int sayi = scan.nextInt();
	
	System.out.println(sayi%2==0 ? "�ift Say�":"Tek Say�");
	
	
	
	// girilen say�n�n mutlak de�erini yazd�r�n�z
	// 5->5		-12-> 12 (girilensay� x olsun. x pozitifse |x|=x x negatifse |x|=-x
	
	
	System.out.println("Say�n�n mutlak de�eri : " +(sayi>0 ? sayi:-sayi));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
}
}
