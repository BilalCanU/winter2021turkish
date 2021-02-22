package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan ismini isteyip ilk harfini büyük harf olarak yazdýrýn
		// Bilal ==> Baþ Harfiniz : B
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Ýsminizi giriniz:");
		
		char ilkharf = scan.next().toUpperCase().charAt(0);
		
		// String'de harflerin indexleri 0'dan baþlar
		// Biz ilk harfi almak istediðimiz için index olarak 0(sýfýr) girmeliyiz.
		
		// eðer charAt(0) yazdýktan sonra .(nokta) koyarsak methodlar gelmez
		// çünkü charAt(0) methodu kullanýnca variable'ýmýzý char yapmýþ oluruz
		// char primitive data tipindendir ve
		// primitive data tipleri method'lara sahip deðildir
		
		
		// String'de harflerin indexleri 0'dan baþlar
		// Biz ilk harfi almak istediðimiz için index olarak 0(sýfýr) girmeliyiz.
		
		System.out.println("Baþ harfiniz :" + ilkharf);
		
		
		scan.close();
		
	}
	
	
	
	
}
