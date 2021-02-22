package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		// kullanýcýdan dairenin yarýçapýný isteyin ve dareinin alanýný yazdýrýn
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alanýný hesaplamak için Dairenin yarýçapýný yazýnýz");
		
		
		// kullanýcýdan yarýçap istedim,
		// önce kullanýcýnýn girdiði yarýçapý içine koyabileceðim bir deðiþken oluþturmalýyým
		
		double yaricap=scan.nextDouble();
		
		float pi = 3.14159f;
        
		
		System.out.println("Dairenin alaný= " + yaricap*yaricap*pi);
				
		scan.close();
	}

}
