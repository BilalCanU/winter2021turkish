package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		// Kullan�c�dan isim ve soyismini isteyip
		// �sim: Bilal Can 
		// Soyisim: �nal
		// Kursumuza kayd�n�z al�nm��t�r, te�ekk�r ederiz.
		
		// Scanner : Kullan�c�dan bilgi almak i�in kullan�yoruz
		// 3 ad�mda i�lemi tamaml�yoruz
		// 1. Ad�m Scanner objesi olu�turuyorduk
		// Scanner'�n �al��mas� i�in java.util(utulities) k�t�phanesinden ilgili 
		// k�sm� class�m�za import etmeliyiz...
		
		
		
		Scanner scan = new Scanner(System.in);
		
		// 2. ad�m kullan�c�ya ne istedi�imizi belirten bir mesaj yazmal�y�z
		
		
		System.out.println("L�tfen sadece �sminizi giriniz:");
		
		// 3. ad�m bir variable olu�turup kullan�c�n�n girdi�i de�eri atayaca��z
		
		String name = scan.nextLine();
		
		System.out.println("L�tfen sadece soyisminizi giriniz:");
		
		//String surname = scan.nextLine(); bu �ekilde yazarsak
		//sadece ilk kelimeyi al�r sonrakileri almaz
		
		String surname = scan.nextLine();
		
		
		
		// Benden istenen �ekilde ��kt�y� yazd�rabilirim.
		// e�er yazd�raca��m�z yaz� sabit bir yaz� ise �ift t�rnak aras�nda (" ") yazd�r�yoruz
		// e�er bir variable'a atanm�� de�eri yazd�rmak istersek
		// " " olmadan sadece variable ismini yaz�yoruz
		
		System.out.println("�sminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		System.out.println("Kursumuza kayd�n�z al�nm��t�r, te�ekk�r ederiz.");
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
