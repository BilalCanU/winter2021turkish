package day07_ifElsestatements;

import java.util.Scanner;

public class C8_IfElseDenme {

	public static void main(String[] args) {
		
		// aylýk gelirini isteyin... 
		// evimizin deðeri 150.000 lira 
		// evin borcunu ne kadar sürede ödeyebilir hesaplayýn.
		// 150.000/maaþ formül
		// 
		
		
		 Scanner scan= new Scanner(System.in);
	        System.out.println("Lutfen alacaðýnýz evin fiyatýný giriniz (Min.50.000)");
	        int ev = scan.nextInt();
	       
	        System.out.println("Lutfen Aylýk gelirinizi giriniz (Min.500)");
	        int maas = scan.nextInt();
	        
	        int aySayýsý= ev/maas;
	      
		
		
		if (ev<=50000 || maas<=500) {
			System.out.println("Lütfen Geçerli bir Deðer giriniz...");
		} else if (ev==0 && maas==0) {
			ev++;
			maas++;
			System.out.println("Lütfen Geçerli bir Deðer giriniz...");
		}
		  else if (aySayýsý<12) {
			System.out.println("Uygun faizli");
			System.out.println("Odeyecegýnýz ay sayýsý : " + aySayýsý);
		} else if (aySayýsý<36){
			System.out.println("Düþük ölçekli Faiz");
			System.out.println("Odeyecegýnýz ay sayýsý : " + aySayýsý);
		} else if (aySayýsý<72) {
			System.out.println("Orta ölçekli Faiz");
			System.out.println("Odeyecegýnýz ay sayýsý : " + aySayýsý);
		}	else {
			System.out.println("Yüksek ölçekli Faiz!");
			System.out.println("Odeyecegýnýz ay sayýsý : " + aySayýsý);
		}
		
		 
		
		// Hocam ev ve maaþ deðerleri sýfýr girildiðinde program hata veriyor nedeni nedir?
		
		
		
		
		
		
		scan.close();
		
	}

}