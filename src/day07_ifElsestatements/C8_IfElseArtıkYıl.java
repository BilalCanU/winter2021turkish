package day07_ifElsestatements;

import java.util.Scanner;

public class C8_IfElseArt�kY�l {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		//Kontrol edilecek y�l
		System.out.println("Bir y�l giriniz");
		 
		 for (int yil1= scan.nextInt();yil1<4000;yil1++) {
		if((yil1 % 400 == 0) || ((yil1 % 4 == 0) && (yil1 % 100 != 0)))
		System.out.println( + yil1 + " y�l� art�k bir y�ld�r");
		else
		System.out.println( yil1 + " y�l� art�k y�l de�ildir");
		}
		
		
		
		
		scan.close();
		}

	}


