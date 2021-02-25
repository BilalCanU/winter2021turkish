package day08_ifElseÝfNestedÝf;

import java.util.Scanner;

public class C5_IfElseNestedSoru {

	public static void main(String[] args) {
		
		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 			Kullanicidan bir sifre girmesini isteyin
 			Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  
 			“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
  			Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  
  			“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 */
		
		// 1. iþlem kullanýcýdan þifreyi alýp ilk harfine bak
		// büyük harf mi küçük harf mi?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Þifrenizi giriniz:");
		String sifre = scan.nextLine();
		if (sifre.charAt(0)=='A') {
			System.out.println("Geçerli Þifre");
		} else if (sifre.charAt(0)=='z'){
			System.out.println("Geçerli Þifre");
		} else {
			System.out.println("Geçersiz");
		}
		scan.close();
	}
}
