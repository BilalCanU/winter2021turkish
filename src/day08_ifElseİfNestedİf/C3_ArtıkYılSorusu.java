package day08_ifElse�fNested�f;

import java.util.Scanner;

public class C3_Art�kY�lSorusu {

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
		
		
		if (yil%4==0 && yil%100!=0) {
			System.out.println("Art�k y�l");
		} else if (yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("Art�k Y�l");
		} else {
			System.out.println("Art�k Y�l de�il");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
