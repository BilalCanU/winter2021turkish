package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ismini ve soyismini al�p aralar�nda bir bo�luk b�rakarak 
		// isim ve soyisim yazd�rma
		
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("�siminizi giriniz:");
		
		String name=scan.nextLine(); // sadece next() se�ilirse kullan�c� birden fazla kelime girse bile ilk kelimeyi al�r
		
		System.out.println("L�tfen soyisminizi giriniz:");
		String surname= scan.nextLine();
		
		System.out.println(name+" "+surname);
		
		scan.close();
		
		
		
	}

}
