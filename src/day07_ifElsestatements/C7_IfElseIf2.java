package day07_ifElsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// 
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen 2 say� giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		if (sayi1==0 || sayi2 ==0) {
			System.out.println("S�f�r �arpmaya g�re yutan elemand�r!");
		} else if (sayi1>0 && sayi2>0) {
			System.out.println("say�lar�n toplam�: " +(sayi1+sayi2));
		}  else if (sayi1<0 && sayi2<0) {
			System.out.println("say�lar�n �arp�m�" + (sayi1*sayi2));
		} else {
			System.out.println("Farkl� i�aretlerde say�larla i�lem yapamazs�n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
