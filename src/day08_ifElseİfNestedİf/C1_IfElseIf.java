package day08_ifElse�fNested�f;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		
		
		// kullan�c�dan g�n ismini yazmas�n� isteyin.
		// girilen isim ge�erli bir g�n ise g�n
		// isminin 1.,2 ve 3. harflerini ilk harf b�y�k di�er ikisi k���k olarak yaz�nd�r�n,
		// g�n ismi ge�erli de�ilse "ge�erli g�n ismi giriniz" yazd�r�n
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen G�n ismini giriniz");
		
		String gun�smi = scan.nextLine(); // girilen t�m yaz�y� k���k yapacak
		
		if (gun�smi.equalsIgnoreCase("pazar") || gun�smi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gun�smi.equalsIgnoreCase("sal�")) {
			System.out.println("Sal");
		} else if (gun�smi.equalsIgnoreCase("�ar�amba")) {
			System.out.println("�ar");
		} else if (gun�smi.equalsIgnoreCase("per�embe")) {
			System.out.println("Per");
		} else if (gun�smi.equalsIgnoreCase("cuma") || gun�smi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("Sadece g�n ismi giriniz");
		} 
		
		 // equalsIgnoreCase() :  methodu iki string'in b�y�k, k���k harf hassasiyeti olmadan
		 // e�it olup olmad���n� kontrol eder.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
