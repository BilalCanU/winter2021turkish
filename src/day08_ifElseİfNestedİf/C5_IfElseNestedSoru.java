package day08_ifElse�fNested�f;

import java.util.Scanner;

public class C5_IfElseNestedSoru {

	public static void main(String[] args) {
		
		/*
		 * Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 			Kullanicidan bir sifre girmesini isteyin
 			Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise  
 			�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
  			Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise  
  			�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		 */
		
		// 1. i�lem kullan�c�dan �ifreyi al�p ilk harfine bak
		// b�y�k harf mi k���k harf mi?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ifrenizi giriniz:");
		String sifre = scan.nextLine();
		if (sifre.charAt(0)=='A') {
			System.out.println("Ge�erli �ifre");
		} else if (sifre.charAt(0)=='z'){
			System.out.println("Ge�erli �ifre");
		} else {
			System.out.println("Ge�ersiz");
		}
		scan.close();
	}
}
