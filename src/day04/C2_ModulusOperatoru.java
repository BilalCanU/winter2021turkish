package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operat�r� b�lme i�leminde kalan� verir
		
		// % (Shift+5)
		
		// herhangi bir say�n�n 7 ile b�l�nebildi�ini kontrol etmek i�in 
		// modulus i�lemi kullan�r�z.
		
		
		int kalan= 15 % 4 ;
		
		System.out.println(kalan);  // 3

		System.out.println( 26 % 8 ); // 2
		
		// 856 say�s�n�n birler basama�� ka�t�r? 6
		
		int sayi =856;
		
		
		int birlerbasamagi = 856 % 10;
		
		System.out.println("Say�n�n birler basamas�� = " + birlerbasamagi);
		
		// 856 say�s�n�n onlar'lar basama�� ka�t�r? 5
		// bunun i�in buldu�um birler basama��ndan kurtulmam gerekiyor
		
		
		sayi/=10;
		
		int onlarBasamagi2 = sayi %10;
		
		System.out.println("on'a b�l�nd�kten sonra say�n�n de�eri "+onlarBasamagi2);
		
		// yuzler basama��n� bulmak i�in bir kere daha ayn� i�lemi yap�yorum
		
		sayi/=10; // bu sat�rla onlar basama��ndan da kurtuluyorum
		
		System.out.println("2. defa 10'a b�l�nd�kten sonra "+ sayi);
		
		
		
		double yasim= 55.3 % 10;
		
		System.out.println("ya��m " + yasim);
		
		
		
		
		
		
		
		
		
		
	}

}
