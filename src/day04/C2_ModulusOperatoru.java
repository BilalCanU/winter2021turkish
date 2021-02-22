package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operatörü bölme iþleminde kalaný verir
		
		// % (Shift+5)
		
		// herhangi bir sayýnýn 7 ile bölünebildiðini kontrol etmek için 
		// modulus iþlemi kullanýrýz.
		
		
		int kalan= 15 % 4 ;
		
		System.out.println(kalan);  // 3

		System.out.println( 26 % 8 ); // 2
		
		// 856 sayýsýnýn birler basamaðý kaçtýr? 6
		
		int sayi =856;
		
		
		int birlerbasamagi = 856 % 10;
		
		System.out.println("Sayýnýn birler basamasðý = " + birlerbasamagi);
		
		// 856 sayýsýnýn onlar'lar basamaðý kaçtýr? 5
		// bunun için bulduðum birler basamaðýndan kurtulmam gerekiyor
		
		
		sayi/=10;
		
		int onlarBasamagi2 = sayi %10;
		
		System.out.println("on'a bölündükten sonra sayýnýn deðeri "+onlarBasamagi2);
		
		// yuzler basamaðýný bulmak için bir kere daha ayný iþlemi yapýyorum
		
		sayi/=10; // bu satýrla onlar basamaðýndan da kurtuluyorum
		
		System.out.println("2. defa 10'a bölündükten sonra "+ sayi);
		
		
		
		double yasim= 55.3 % 10;
		
		System.out.println("yaþým " + yasim);
		
		
		
		
		
		
		
		
		
		
	}

}
