package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	
	public static void main(String[] args) {
		
		/* Scanner ile kullacýdan bilgi alabiliriz
		 * 3 adýmla scanner iþlemini gerçekleþtiriyoruz
		 * 
		 * 1. adým Scanner objesi oluþturacaðýz
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		// new : Java da ne zaman new kelimesini görürsek yeni bir object oluþturuluyor demektir
		// parantezin içine yazýlan deðerlere parametre diyoruz ve scanner için System.in yazmamýz gerekir
		// Bir kod yazdýðýmýzda kodun altýnda kýrmýzý çizgi oluþuyorsa veya satýr numarasý
		// olan kýsýmda kýrmýzý X oluþuyorsa bir þeyler yanlýþ demektir o satýrda hata vardýr.
		// java.util java'nýn bizim için hazýrladýðý bir kütüphanedir
		// ihtiyacýmýz olduðunda ihtiyacýmýz olan modülü class'a import etmemiz yeterlidir.
		// scan: oluþturduðumuz Scanner objesine verdiðimiz isimdir.
		// farklý isimlerde verebiliriz
		// ancak scan ismi tüm programcýlar tarafýndan kullanýlan bir isimdir
		// kodumuzun anlaþýlabilir ve rahat okunabilir olmasý için scan ismini kullanmamýz tavsiye edilir.
		
		
		// 2. adým kullanýcýya bir mesaj yazýn
		System.out.println("Kararenin bir kenar uzunluðunu girin");
		
		// 3. adým kullanýcýnýn konsola girdiði deðeri programýmýza alacaðýz
		// kullanýcýdan bir kenar uzunluðu istediðim için kullanýcý küçük bir sayý da girebilir,
		// büyük bir sayý da girebilir. tam sayý da yazabilir, virgüllü sayý da yazabilir
		
		double kenar=scan.nextDouble();
		
		
		System.out.println("Girdiðiniz kenar uzunluðuna sahip karenin alaný= "+kenar*kenar);
		
		
		scan.close();
		
		
		
		
		
		
		
	}
}
