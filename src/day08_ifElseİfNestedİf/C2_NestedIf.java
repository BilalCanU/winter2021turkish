package day08_ifElse�fNested�f;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		
		// Nested : i� i�e , yuvalanm��
		/*
		 ***verilen cinsiyet ve ya� i�in ki�inin emekli olup olmayaca��n�
		 *** yazd�ran bir java program� yaz�n�z
		 * e�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir
		 * �al��an erkekse 65 ya��ndan b�y�k oldu�unda emekli olabilir
		 * 
		 */
		
		
		String cinsiyet = "kad�n";
		int yas = 59;
		if (yas<0) {
			System.out.println("yas negatif olamaz");
		} else if(cinsiyet.equalsIgnoreCase(("erkek")) && yas>=65) {
			System.out.println("Emekli olabilirsin.");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("Emekli olamazs�n");
		} else if (cinsiyet.equalsIgnoreCase("kad�n")&& yas>=60) {
			System.out.println("Emekli olabilirsin");
		} else if (cinsiyet.equalsIgnoreCase("kad�n")&& yas<60) {
			System.out.println("Emekli olabilirsin");
		} else {
			System.out.println("Cinsiyet veya ya� tan�ms�z");
		}
		
		System.out.println();
		System.out.println("nested if ile sonu�:");
		System.out.println("");
		
		// buras� ilk if'in ba�lang�c�
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<0) {									// ilk ifin i�indeki if'in ba�lang�c�
				System.out.println("erkek yas negatif olamaz");
			} else if (yas<65) {
				System.out.println("Emekli olamazs�n");
			} else {
				System.out.println("Emekli olabilirsin");
			}												// ilk ifin i�indeki if'in biti�i
			
		} else if (cinsiyet.equalsIgnoreCase("kad�n")) {
			
			if (yas<0) {
				System.out.println("kad�n yas negatif olamaz");
			} else if (yas<60) {
				System.out.println("Emekli olamazs�n");
			} else {
				System.out.println("Emekli olabilirsin");
			}
			
		} else {
			System.out.println("Yazd���n�z cinsiyet sisteme kay�tl� de�il");
		}
		// buras� ilk if'in bitti�i yer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
