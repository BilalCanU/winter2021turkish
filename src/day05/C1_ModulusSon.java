package day05;


public class C1_ModulusSon {
	
	
	public static void main(String[] args) {
		
		
		// Verilen bir integer'�n birler basama��ndaki rakam� yazd�r�n
		
		
		int sayi= 1469;
		
		System.out.println("Verilen say�n�n birler basama�� : "+ sayi%10); // 9
		
		
		// Verilen say�n�n birler basama�� hari� geriye kalan basamaklar� yazd�r�n
		
			
		System.out.println(sayi/10); // 146 ge�ici
		
		System.out.println(sayi/=10); //146 kal�c�
		
		// sayi/10 ile sayi=/10 aras�ndaki fark nedir?
		// = i�areti atama(assigment) demektir
		// bir i�lemde = i�areti varsa de�er kal�c� olarak de�i�ir
		// = i�areti yoksa sadece o anl�k matematiksel bir i�lem yapar
		// say�/10 yaz�l�rsa say�n�n de�eri de�i�mez
		// say�/=10 yaz�l�rsa say� 10'a b�l�n�r ve yeni de�er olarak say�ya atan�r.
		
		System.out.println(sayi);
		
		
		
		
		
		
		
	}

}
