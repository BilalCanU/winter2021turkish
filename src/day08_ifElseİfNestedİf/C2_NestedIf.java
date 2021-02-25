package day08_ifElseİfNestedİf;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		
		// Nested : iç içe , yuvalanmış
		/*
		 ***verilen cinsiyet ve yaş için kişinin emekli olup olmayacağını
		 *** yazdıran bir java programı yazınız
		 * eğer çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir
		 * çalışan erkekse 65 yaşından büyük olduğunda emekli olabilir
		 * 
		 */
		
		
		String cinsiyet = "kadın";
		int yas = 59;
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if(cinsiyet.equalsIgnoreCase(("erkek")) && yas>=65) {
			System.out.println("Emekli olabilirsin.");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("Emekli olamazsın");
		} else if (cinsiyet.equalsIgnoreCase("kadın")&& yas>=60) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("kadın")&& yas<60) {
			System.out.println("Emekli olabilirsin");
		} else {
			System.out.println("Cinsiyet veya yaş tanımsız");
		}
		
		System.out.println();
		System.out.println("nested if ile sonuç:");
		System.out.println("");
		
		// burası ilk if'in başlangıcı
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {									// ilk ifin içindeki if'in başlangıcı
				System.out.println("erkek yas negatif olamaz");
			} else if (yas<65) {
				System.out.println("Emekli olamazsın");
			} else {
				System.out.println("Emekli olabilirsin");
			}												// ilk ifin içindeki if'in bitişi
			
		} else if (cinsiyet.equalsIgnoreCase("kadın")) {
			
			if (yas<0) {
				System.out.println("kadın yas negatif olamaz");
			} else if (yas<60) {
				System.out.println("Emekli olamazsın");
			} else {
				System.out.println("Emekli olabilirsin");
			}
			
		} else {
			System.out.println("Yazdığınız cinsiyet sisteme kayıtlı değil");
		}
		// burası ilk if'in bittiği yer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
