package day10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		
		
		
		// kullan�c�dan ka��nc� ayda oldu�unu al�n ve ay ismini yazd�r�n
		// say� olarak girilen ay�n ismini yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen kacinci ayda oldu�umuzu giriniz");
		int ay = scan.nextInt();
		
		
		
		switch(ay) {
        case 1:
            System.out.print("Ocak");
            break;
        case 2:
            System.out.print("�ubat");
            break;
        case 3:
            System.out.print("Mart");
            break;
        case 4:
            System.out.print("Nisan");
            break;
        case 5:
            System.out.print("May�s");
            break;
        case 6:
            System.out.print("Haziran");
            break;
        case 7:
            System.out.print("Temmuz");
            break;
        case 8:
            System.out.print("A�ustos");
            break;
        case 9:
            System.out.print("Eyl�l");
            break;
        case 10:
            System.out.print("Ekim");
            break;
        case 11:
            System.out.print("Kas�m");
            break;
        case 12:
            System.out.print("Aral�k");
            break;
            default:
            	System.out.println("Ge�erli bir ay giriniz");
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
