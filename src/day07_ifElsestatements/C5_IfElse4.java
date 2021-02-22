package day07_ifElsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Üçgenin kenar uzunluklarýný giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eþkenar üçgen");
		} else {
			System.out.println("Eþkenar deðil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
