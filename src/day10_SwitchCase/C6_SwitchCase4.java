package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		
		// kullan�c�dan VIP (Very �mportant Person) k�saltmas�nda hangi harfin anlam�n� 
		// istedi�ini soral�m 
		// girilen harfin a��klamas�n� yazd�ral�m
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*VIP* k�saltmas�nda hangi harfin a��klamas�n� g�rmek istersiniz");
		char harf = scan.nextLine().toLowerCase().charAt(0);
		
 		switch(harf) {
        case 'v':
        case 'V':
            System.out.println("Very");
            break;
        case '�':
        case 'I':
        case 'i':
        case '�':
            System.out.println("�mportant");
            break;
        case 'p':
        case 'P':
            System.out.println("Person");
            break;
            default:
            	System.out.println("Ge�ersiz harf");
 		}
 		
 		System.out.println();
 		System.out.println("L�tfen Harf Giriniz");
 		String str=scan.nextLine().toLowerCase(); 		
 		
 		switch(str) {
        case "v":
        case "V":
            System.out.print("Very");
            break;
        case "�":
        case "i":
            System.out.print("�mportant");
            break;
        case "p":
        case "P":
            System.out.print("Person");
            break;
            default:
            	System.out.println("Ge�ersiz harf");
 		}
 		
 		scan.close();
            
	}
}
