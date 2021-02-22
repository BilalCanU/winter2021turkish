package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 4 basamaklý bir sayý alalým ve 
		// sayýnýn basamaklarýný ters sýrada yazdýralým
		
		// bir sayýnýn basamaklarýný elde etmek için 2 iþlemi tekrar tekrar yaparýz
		// 1. iþlem en sondaki basamaðý elde etmek
		// 2. iþlem en sondaki basamaðý yok etmek
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Basamaklarýný bulmak için 4 basamaklý bir sayý giriniz");
		
		
		int sayi=scan.nextInt(); // bu satýrdan itibaren elimizde 4 basamaklý bir sayý var
		// 4 basamaðý elde etmek için yukarýda yazdýðýmýz iþlemi 3 kere yapýyoruz
		
		// 1. tekrar
		
		int birlerBas=sayi % 10;
		sayi /= 10;
		
		// bu satýrdan itibaren sayýmýz 3 basamaklý hale geldi
		
		int onlarBas = sayi %10;
		sayi/=10;
		
		// bu satýrdan itibaren sayýmýz 2 basamaklý hale geldi
		
		int yuzlerBas = sayi % 10;
		sayi/=10;
		
		// bu satýrdan sonra sayýmýz 1 basamaklý hale geldi
		
		int binlerBas= sayi;
		
		// tüm basamaklar var
		// tüm basamaklarý yazdýralým
		System.out.println("Birler basamaðý : "+ birlerBas);
		System.out.println("Onlar basamaðý : "+ onlarBas);
		System.out.println("Yüzler basamaðý : "+yuzlerBas);
		System.out.println("Binler basamaðý : "+binlerBas);
		
		System.out.println("Tersten : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		// tüm basamaklarýn toplamýný bulalým
		
		System.out.println("Basamaklarýn toplamý : "+ (birlerBas+onlarBas+yuzlerBas+binlerBas));
		
		
		
		
		scan.close();
		
	}

}
