package day10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		
		
		
		// kullanýcýdan kaçýncý ayda olduðunu alýn ve ay ismini yazdýrýn
		// sayý olarak girilen ayýn ismini yazdýrýn
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen kacinci ayda olduðumuzu giriniz");
		int ay = scan.nextInt();
		
		
		
		switch(ay) {
        case 1:
            System.out.print("Ocak");
            break;
        case 2:
            System.out.print("Þubat");
            break;
        case 3:
            System.out.print("Mart");
            break;
        case 4:
            System.out.print("Nisan");
            break;
        case 5:
            System.out.print("Mayýs");
            break;
        case 6:
            System.out.print("Haziran");
            break;
        case 7:
            System.out.print("Temmuz");
            break;
        case 8:
            System.out.print("Aðustos");
            break;
        case 9:
            System.out.print("Eylül");
            break;
        case 10:
            System.out.print("Ekim");
            break;
        case 11:
            System.out.print("Kasým");
            break;
        case 12:
            System.out.print("Aralýk");
            break;
            default:
            	System.out.println("Geçerli bir ay giriniz");
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
