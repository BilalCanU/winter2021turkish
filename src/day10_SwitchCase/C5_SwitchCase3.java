package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		
		
		// kullanýcýdan hangi günde olduðumuzu isteyin (yazýyla)
		// girilen günün hafta içi veya hafta sonu olduðunu yazdýrýn
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir gün giriniz");
		String gun = scan.nextLine().toLowerCase();
		
		switch(gun) {
        case "pazartesi":
        case "salý":
        case "çarþamba": 
        case "perþembe":
        case "cuma":
            System.out.print("Hafta Ýçi");
            break;
        case "cumartesi":
        case "pazar":
            System.out.print("Hafta sonu");
            break;
        default:
        	System.out.println("geçerli bir gün giriniz");
		}
		
		scan.close();
		
		
		
	}
	
}
