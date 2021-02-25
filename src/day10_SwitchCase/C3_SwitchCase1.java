package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		
		// kullanýcýdan bir rakam isteyin
		// girilen rakamý yazý ile yazdýrýn
		
		
		
		
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
            System.out.print("Ýki Bin");
            break;
        case 3:
            System.out.print("Üç Bin");
            break;
        case 4:
            System.out.print("Dört Bin");
            break;
        case 5:
            System.out.print("Beþ Bin");
            break;
        case 6:
            System.out.print("Altý Bin");
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
            System.out.print(" Yüz");
            break;
        case 2:
            System.out.print(" Ýki Yüz");
            break;
        case 3:
            System.out.print(" Üç Yüz");
            break;
        case 4:
            System.out.print(" Dört Yüz");
            break;
        case 5:
            System.out.print(" Beþ Yüz");
            break;
        case 6:
            System.out.print(" Altý Yüz");
            break;
        case 7:
            System.out.print(" Yedi Yüz");
            break;
        case 8:
            System.out.print(" Sekiz Yüz");
            break;
        case 9:
            System.out.print(" Dokuz Yüz");
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
            System.out.print(" Kýrk");
            break;
        case 5:
            System.out.print(" Elli");
            break;
        case 6:
            System.out.print(" Altmýþ");
            break;
        case 7:
            System.out.print(" Yetmiþ");
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
            System.out.print(" Ýki");
            break;
        case 3:
            System.out.print(" Üç");
            break;
        case 4:
            System.out.print(" Dört");
            break;
        case 5:
            System.out.print(" Beþ");
            break;
        case 6:
            System.out.print(" Altý");
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
