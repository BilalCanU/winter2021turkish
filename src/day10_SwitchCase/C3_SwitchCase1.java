package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		
		// kullan�c�dan bir rakam isteyin
		// girilen rakam� yaz� ile yazd�r�n
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir rakam giriniz");
		
		 int sayi = scan.nextInt();
	     int birlerBas = sayi % 10;
	     int onlarBas = sayi / 10;
		 int yuzlerBas = sayi / 100;
		 int binlerBas = sayi / 1000;
		 
         
        switch(binlerBas) {
        case 1:
            System.out.print("Bin");
            break;
        case 2:
            System.out.print("�ki Bin");
            break;
        case 3:
            System.out.print("�� Bin");
            break;
        case 4:
            System.out.print("D�rt Bin");
            break;
        case 5:
            System.out.print("Be� Bin");
            break;
        case 6:
            System.out.print("Alt� Bin");
            break;
        case 7:
            System.out.print("Yedi Bin");
            break;
        case 8:
            System.out.print("Sekiz Bin");
            break;
        case 9:
            System.out.print("Dokuz Bin");
            break;
        }
        switch(yuzlerBas) {
        case 1:
            System.out.print(" Y�z");
            break;
        case 2:
            System.out.print(" �ki Y�z");
            break;
        case 3:
            System.out.print(" �� Y�z");
            break;
        case 4:
            System.out.print(" D�rt Y�z");
            break;
        case 5:
            System.out.print(" Be� Y�z");
            break;
        case 6:
            System.out.print(" Alt� Y�z");
            break;
        case 7:
            System.out.print(" Yedi Y�z");
            break;
        case 8:
            System.out.print(" Sekiz Y�z");
            break;
        case 9:
            System.out.print(" Dokuz Y�z");
            break;
        }
        switch(onlarBas) {
        case 1:
            System.out.print(" On");
            break;
        case 2:
            System.out.print(" Yirmi");
            break;
        case 3:
            System.out.print(" Otuz");
            break;
        case 4:
            System.out.print(" K�rk");
            break;
        case 5:
            System.out.print(" Elli");
            break;
        case 6:
            System.out.print(" Altm��");
            break;
        case 7:
            System.out.print(" Yetmi�");
            break;
        case 8:
            System.out.print(" Seksen");
            break;
        case 9:
            System.out.print(" Doksan");
            break;
        }
        switch(birlerBas) {
        case 1:
            System.out.print(" Bir");
            break;
        case 2:
            System.out.print(" �ki");
            break;
        case 3:
            System.out.print(" ��");
            break;
        case 4:
            System.out.print(" D�rt");
            break;
        case 5:
            System.out.print(" Be�");
            break;
        case 6:
            System.out.print(" Alt�");
            break;
        case 7:
            System.out.print(" Yedi");
            break;
        case 8:
            System.out.print(" Sekiz");
            break;
        case 9:
            System.out.print(" Dokuz");
            break;    
        }
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
