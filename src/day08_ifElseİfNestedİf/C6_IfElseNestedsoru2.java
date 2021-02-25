package day08_ifElseÝfNestedÝf;

import java.util.Scanner;

public class C6_IfElseNestedsoru2 {

	public static void main(String[] args) {
		/* Soru 12) Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. 
		 * Girdiði sayi 5’e bölünüyorsa  son rakamýný kontrol edin. 
		 * Son rakamý 0 ise ekrana “5’e bölünen çift sayý”  yazdýrýn. 
		 * Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn. 
		 * Girdiði password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("4 Basamaklý bir sayý giriniz.");
		
		int sayi=scan.nextInt();
		if (sayi%5==0 && sayi%2==0) {
			System.out.println("5'e bölünebilen Çift sayý");
		} else if (sayi%5==0 && sayi%2==1) {
			System.out.println("5'e bölünebilen Tek sayý");
		} else {
			System.out.println("Tekrar deneyin..");
		}
		scan.close();
	}

}
