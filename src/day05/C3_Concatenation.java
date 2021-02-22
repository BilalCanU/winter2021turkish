package day05;

public class C3_Concatenation {

	
	public static void main(String[] args) {
		
		/* Concatenation (Birleþtirme) : Java'da birden fazla Stringi toplama iþareti ile
		 * toplarsanýz, Java bu Stringleri yanyana yazar 
		 */
		
		String str1="Java";
		String str2="Güzeldir";
		
		System.out.println(str1+str2); // JavaGüzeldir
		
		// eðer arada boþluk býrakmak isterseniz
		
		System.out.println(str1+" "+str2); // Java Güzeldir
		
		
		System.out.println(str1+ ' '+str2);
		
		
		// Güzeldir Java
		
		System.out.println(str2+" "+str1);
		
		
		int sayi1= 5;
		int sayi2=4;
		
		// verilen deðiþkenleri kullanarak consolda 9 yazdýrýn.
		
		System.out.println(sayi1+sayi2);
		
		
		
		System.out.println(sayi1+ sayi2 +str1+str2); //9JavaGüzeldir
		
		System.out.println(str1+str2+sayi1+sayi2); // JavaGüzeldir54
		 
		
		// javagüzeldir1 verilen deðiþkenlerle yazdýrýn
		
		System.out.println(str1+str2+(sayi1-sayi2)); // JavaGüzledir1
		
		// Java, matematiksel bir iþlem yaparken char data türünden bir deðerle
		// karþýlaþýrsa o  char'ýn ascii deðerini alýr
		
		System.out.println(sayi1+sayi2+str1+' '+str2); //9Java Güzeldir
		
		System.out.println(str1+str2+sayi1*sayi2); // JavaGüzeldir20
		// Matematiksel olarak öncelik çarpma olduðu için önce 5*4=20 yapar sonra Concatenation yapar
		
		/* SON TEKRAR:
		 kural1 : Eðer toplanan deðerlerden bir tanesi bile String ise Java toplama deðil 
		 		Concatenation (Birleþtirme) yapar
		 Kural2 : Eðer toplanan deðerlerin ikisi de matematiksel iþlemse Java toplar.
		 
		 Kural3 : Eðer sayý ve String deðiþkenler birlikte kullanýlacaksa öncelikler
		 		  belirlenip parantez kullanýlabilir.
		 		  
		 kural4 : Matematiksel bir iþlemde char deðiþken kullanýlýrsa Java char'ýn ascii
		 		  deðerini iþleme alýr
		 		  
		 Kural5 : char bir deðiþken ile String bir deðiþken toplanýrsa concatenation yapar
		 		
		*/
		
		
		
		
		
		
	}
}
