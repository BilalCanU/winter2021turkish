package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 4 basamakl� bir say� alal�m ve 
		// say�n�n basamaklar�n� ters s�rada yazd�ral�m
		
		// bir say�n�n basamaklar�n� elde etmek i�in 2 i�lemi tekrar tekrar yapar�z
		// 1. i�lem en sondaki basama�� elde etmek
		// 2. i�lem en sondaki basama�� yok etmek
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Basamaklar�n� bulmak i�in 4 basamakl� bir say� giriniz");
		
		
		int sayi=scan.nextInt(); // bu sat�rdan itibaren elimizde 4 basamakl� bir say� var
		// 4 basama�� elde etmek i�in yukar�da yazd���m�z i�lemi 3 kere yap�yoruz
		
		// 1. tekrar
		
		int birlerBas=sayi % 10;
		sayi /= 10;
		
		// bu sat�rdan itibaren say�m�z 3 basamakl� hale geldi
		
		int onlarBas = sayi %10;
		sayi/=10;
		
		// bu sat�rdan itibaren say�m�z 2 basamakl� hale geldi
		
		int yuzlerBas = sayi % 10;
		sayi/=10;
		
		// bu sat�rdan sonra say�m�z 1 basamakl� hale geldi
		
		int binlerBas= sayi;
		
		// t�m basamaklar var
		// t�m basamaklar� yazd�ral�m
		System.out.println("Birler basama�� : "+ birlerBas);
		System.out.println("Onlar basama�� : "+ onlarBas);
		System.out.println("Y�zler basama�� : "+yuzlerBas);
		System.out.println("Binler basama�� : "+binlerBas);
		
		System.out.println("Tersten : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		// t�m basamaklar�n toplam�n� bulal�m
		
		System.out.println("Basamaklar�n toplam� : "+ (birlerBas+onlarBas+yuzlerBas+binlerBas));
		
		
		
		
		scan.close();
		
	}

}
