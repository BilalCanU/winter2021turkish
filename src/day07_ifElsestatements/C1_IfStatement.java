package day07_ifElsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		

		
		// kullan�dan bir tam say� isteyin
		// say� pozitif ise "say� pozitif" yazd�r�n
		// say� 100'den k���kse "k���k say�" yazd�r�n
		// say� 1000'den b�y�kse "b�y�k say�" yazd�r�n
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz.");
		int sayi1 = scan.nextInt();
		
		
		
		if (sayi1>0) {
			System.out.println("Say� pozitif");
		}
			
		if (sayi1<100) {
			System.out.println("K���k say�");
		}
		
		if (sayi1>1000) {
			System.out.println("b�y�k say�");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
