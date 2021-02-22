package day05;


public class C1_ModulusSon {
	
	
	public static void main(String[] args) {
		
		
		// Verilen bir integer'ýn birler basamaðýndaki rakamý yazdýrýn
		
		
		int sayi= 1469;
		
		System.out.println("Verilen sayýnýn birler basamaðý : "+ sayi%10); // 9
		
		
		// Verilen sayýnýn birler basamaðý hariç geriye kalan basamaklarý yazdýrýn
		
			
		System.out.println(sayi/10); // 146 geçici
		
		System.out.println(sayi/=10); //146 kalýcý
		
		// sayi/10 ile sayi=/10 arasýndaki fark nedir?
		// = iþareti atama(assigment) demektir
		// bir iþlemde = iþareti varsa deðer kalýcý olarak deðiþir
		// = iþareti yoksa sadece o anlýk matematiksel bir iþlem yapar
		// sayý/10 yazýlýrsa sayýnýn deðeri deðiþmez
		// sayý/=10 yazýlýrsa sayý 10'a bölünür ve yeni deðer olarak sayýya atanýr.
		
		System.out.println(sayi);
		
		
		
		
		
		
		
	}

}
