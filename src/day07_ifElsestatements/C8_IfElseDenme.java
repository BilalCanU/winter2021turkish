package day07_ifElsestatements;

import java.util.Scanner;

public class C8_IfElseDenme {

	public static void main(String[] args) {
		
		// ayl�k gelirini isteyin... 
		// evimizin de�eri 150.000 lira 
		// evin borcunu ne kadar s�rede �deyebilir hesaplay�n.
		// 150.000/maa� form�l
		// 
		
		
		 Scanner scan= new Scanner(System.in);
	        System.out.println("Lutfen alaca��n�z evin fiyat�n� giriniz (Min.50.000)");
	        int ev = scan.nextInt();
	       
	        System.out.println("Lutfen Ayl�k gelirinizi giriniz (Min.500)");
	        int maas = scan.nextInt();
	        
	        int aySay�s�= ev/maas;
	      
		
		
		if (ev<=50000 || maas<=500) {
			System.out.println("L�tfen Ge�erli bir De�er giriniz...");
		} else if (ev==0 && maas==0) {
			ev++;
			maas++;
			System.out.println("L�tfen Ge�erli bir De�er giriniz...");
		}
		  else if (aySay�s�<12) {
			System.out.println("Uygun faizli");
			System.out.println("Odeyeceg�n�z ay say�s� : " + aySay�s�);
		} else if (aySay�s�<36){
			System.out.println("D���k �l�ekli Faiz");
			System.out.println("Odeyeceg�n�z ay say�s� : " + aySay�s�);
		} else if (aySay�s�<72) {
			System.out.println("Orta �l�ekli Faiz");
			System.out.println("Odeyeceg�n�z ay say�s� : " + aySay�s�);
		}	else {
			System.out.println("Y�ksek �l�ekli Faiz!");
			System.out.println("Odeyeceg�n�z ay say�s� : " + aySay�s�);
		}
		
		 
		
		// Hocam ev ve maa� de�erleri s�f�r girildi�inde program hata veriyor nedeni nedir?
		
		
		
		
		
		
		scan.close();
		
	}

}