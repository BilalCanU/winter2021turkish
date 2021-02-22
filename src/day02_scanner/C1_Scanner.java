package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	
	public static void main(String[] args) {
		
		/* Scanner ile kullac�dan bilgi alabiliriz
		 * 3 ad�mla scanner i�lemini ger�ekle�tiriyoruz
		 * 
		 * 1. ad�m Scanner objesi olu�turaca��z
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		// new : Java da ne zaman new kelimesini g�r�rsek yeni bir object olu�turuluyor demektir
		// parantezin i�ine yaz�lan de�erlere parametre diyoruz ve scanner i�in System.in yazmam�z gerekir
		// Bir kod yazd���m�zda kodun alt�nda k�rm�z� �izgi olu�uyorsa veya sat�r numaras�
		// olan k�s�mda k�rm�z� X olu�uyorsa bir �eyler yanl�� demektir o sat�rda hata vard�r.
		// java.util java'n�n bizim i�in haz�rlad��� bir k�t�phanedir
		// ihtiyac�m�z oldu�unda ihtiyac�m�z olan mod�l� class'a import etmemiz yeterlidir.
		// scan: olu�turdu�umuz Scanner objesine verdi�imiz isimdir.
		// farkl� isimlerde verebiliriz
		// ancak scan ismi t�m programc�lar taraf�ndan kullan�lan bir isimdir
		// kodumuzun anla��labilir ve rahat okunabilir olmas� i�in scan ismini kullanmam�z tavsiye edilir.
		
		
		// 2. ad�m kullan�c�ya bir mesaj yaz�n
		System.out.println("Kararenin bir kenar uzunlu�unu girin");
		
		// 3. ad�m kullan�c�n�n konsola girdi�i de�eri program�m�za alaca��z
		// kullan�c�dan bir kenar uzunlu�u istedi�im i�in kullan�c� k���k bir say� da girebilir,
		// b�y�k bir say� da girebilir. tam say� da yazabilir, virg�ll� say� da yazabilir
		
		double kenar=scan.nextDouble();
		
		
		System.out.println("Girdi�iniz kenar uzunlu�una sahip karenin alan�= "+kenar*kenar);
		
		
		scan.close();
		
		
		
		
		
		
		
	}
}
