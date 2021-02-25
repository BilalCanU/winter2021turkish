package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		
		// kullanýcýdan VIP (Very Ýmportant Person) kýsaltmasýnda hangi harfin anlamýný 
		// istediðini soralým 
		// girilen harfin açýklamasýný yazdýralým
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*VIP* kýsaltmasýnda hangi harfin açýklamasýný görmek istersiniz");
		char harf = scan.nextLine().toLowerCase().charAt(0);
		
 		switch(harf) {
        case 'v':
        case 'V':
            System.out.println("Very");
            break;
        case 'ý':
        case 'I':
        case 'i':
        case 'Ý':
            System.out.println("Ýmportant");
            break;
        case 'p':
        case 'P':
            System.out.println("Person");
            break;
            default:
            	System.out.println("Geçersiz harf");
 		}
 		
 		System.out.println();
 		System.out.println("Lütfen Harf Giriniz");
 		String str=scan.nextLine().toLowerCase(); 		
 		
 		switch(str) {
        case "v":
        case "V":
            System.out.print("Very");
            break;
        case "ý":
        case "i":
            System.out.print("Ýmportant");
            break;
        case "p":
        case "P":
            System.out.print("Person");
            break;
            default:
            	System.out.println("Geçersiz harf");
 		}
 		
 		scan.close();
            
	}
}
