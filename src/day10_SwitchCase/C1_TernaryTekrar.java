package day10_SwitchCase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		
		// kullan�c�dan bir say� al�n ve
		// say� 3 basamakl� pozitif say� ise "�� basamakl� say�" , yoksa
		// "�� basamakl� de�il"" yazd�r�n
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir tam say� giriniz");
		int sayi= scan.nextInt();
		
		String sonuc =sayi>99 ? (sayi<1000 ? "�� basamakl�" : "�� basamakl� de�il") : "�� basamakl� de�il";
		
		
		System.out.println((sayi>99 ? (sayi<1000 ? "�� basamakl�" : "�� basamakl� de�il") : "�� basamakl� de�il"));
		
		System.out.println(sonuc);
		
		
		
		// nested ternary olmas�n
		
		String sonuc2=sayi>=100 && sayi<1000 || sayi<=-100 && sayi>-1000 ? "�� basamakl�":"�� basamakl� de�il";
		
		System.out.println(sonuc2);
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
