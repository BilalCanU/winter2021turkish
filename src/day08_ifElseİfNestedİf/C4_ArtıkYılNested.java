package day08_ifElse�fNested�f;

import java.util.Scanner;

public class C4_Art�kY�lNested {

	public static void main(String[] args) {
		
		
		/*
	 	Kullanicidan artik yil olup olmadigini kontrol 									
	 	etmek icin yil girmesini isteyin.
					
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4�un kati olmasina ragmen 100 ile
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen y�l yaz�n�z");
		
		int yil= scan.nextInt();
		
		
		if (yil%100==0) { // 100'e b�l�nebilir
			
			if (yil%400==0) {
				System.out.println("Art�k Y�l");
			} else {
				System.out.println("Art�k Y�l De�il");
				}
			
		 } else { // 100'e b�l�nemez
			
			 if (yil%4==0) {
					System.out.println("Art�k Y�l");

			} else {
				System.out.println("Art�k Y�l De�il");

			}
			 
		 } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
}
