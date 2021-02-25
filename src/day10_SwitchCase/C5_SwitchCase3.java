package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		
		
		// kullan�c�dan hangi g�nde oldu�umuzu isteyin (yaz�yla)
		// girilen g�n�n hafta i�i veya hafta sonu oldu�unu yazd�r�n
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir g�n giriniz");
		String gun = scan.nextLine().toLowerCase();
		
		switch(gun) {
        case "pazartesi":
        case "sal�":
        case "�ar�amba": 
        case "per�embe":
        case "cuma":
            System.out.print("Hafta ��i");
            break;
        case "cumartesi":
        case "pazar":
            System.out.print("Hafta sonu");
            break;
        default:
        	System.out.println("ge�erli bir g�n giriniz");
		}
		
		scan.close();
		
		
		
	}
	
}
