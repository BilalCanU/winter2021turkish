package day07_ifElsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		

		
		// kullanýdan bir tam sayý isteyin
		// sayý pozitif ise "sayý pozitif" yazdýrýn
		// sayý 100'den küçükse "küçük sayý" yazdýrýn
		// sayý 1000'den büyükse "büyük sayý" yazdýrýn
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayý giriniz.");
		int sayi1 = scan.nextInt();
		
		
		
		if (sayi1>0) {
			System.out.println("Sayý pozitif");
		}
			
		if (sayi1<100) {
			System.out.println("Küçük sayý");
		}
		
		if (sayi1>1000) {
			System.out.println("büyük sayý");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
