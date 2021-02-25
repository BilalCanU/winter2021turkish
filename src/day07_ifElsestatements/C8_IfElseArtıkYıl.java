package day07_ifElsestatements;

import java.util.Scanner;

public class C8_IfElseArtýkYýl {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		//Kontrol edilecek yýl
		System.out.println("Bir yýl giriniz");
		 
		 for (int yil1= scan.nextInt();yil1<4000;yil1++) {
		if((yil1 % 400 == 0) || ((yil1 % 4 == 0) && (yil1 % 100 != 0)))
		System.out.println( + yil1 + " yýlý artýk bir yýldýr");
		else
		System.out.println( yil1 + " yýlý artýk yýl deðildir");
		}
		
		
		
		
		scan.close();
		}

	}


