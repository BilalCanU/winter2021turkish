package day08_ifElseÝfNestedÝf;

import java.util.Scanner;

public class C4_ArtýkYýlNested {

	public static void main(String[] args) {
		
		
		/*
	 	Kullanicidan artik yil olup olmadigini kontrol 									
	 	etmek icin yil girmesini isteyin.
					
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4’un kati olmasina ragmen 100 ile
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yýl yazýnýz");
		
		int yil= scan.nextInt();
		
		
		if (yil%100==0) { // 100'e bölünebilir
			
			if (yil%400==0) {
				System.out.println("Artýk Yýl");
			} else {
				System.out.println("Artýk Yýl Deðil");
				}
			
		 } else { // 100'e bölünemez
			
			 if (yil%4==0) {
					System.out.println("Artýk Yýl");

			} else {
				System.out.println("Artýk Yýl Deðil");

			}
			 
		 } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
}
