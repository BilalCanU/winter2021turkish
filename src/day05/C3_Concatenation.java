package day05;

public class C3_Concatenation {

	
	public static void main(String[] args) {
		
		/* Concatenation (Birle�tirme) : Java'da birden fazla Stringi toplama i�areti ile
		 * toplarsan�z, Java bu Stringleri yanyana yazar 
		 */
		
		String str1="Java";
		String str2="G�zeldir";
		
		System.out.println(str1+str2); // JavaG�zeldir
		
		// e�er arada bo�luk b�rakmak isterseniz
		
		System.out.println(str1+" "+str2); // Java G�zeldir
		
		
		System.out.println(str1+ ' '+str2);
		
		
		// G�zeldir Java
		
		System.out.println(str2+" "+str1);
		
		
		int sayi1= 5;
		int sayi2=4;
		
		// verilen de�i�kenleri kullanarak consolda 9 yazd�r�n.
		
		System.out.println(sayi1+sayi2);
		
		
		
		System.out.println(sayi1+ sayi2 +str1+str2); //9JavaG�zeldir
		
		System.out.println(str1+str2+sayi1+sayi2); // JavaG�zeldir54
		 
		
		// javag�zeldir1 verilen de�i�kenlerle yazd�r�n
		
		System.out.println(str1+str2+(sayi1-sayi2)); // JavaG�zledir1
		
		// Java, matematiksel bir i�lem yaparken char data t�r�nden bir de�erle
		// kar��la��rsa o  char'�n ascii de�erini al�r
		
		System.out.println(sayi1+sayi2+str1+' '+str2); //9Java G�zeldir
		
		System.out.println(str1+str2+sayi1*sayi2); // JavaG�zeldir20
		// Matematiksel olarak �ncelik �arpma oldu�u i�in �nce 5*4=20 yapar sonra Concatenation yapar
		
		/* SON TEKRAR:
		 kural1 : E�er toplanan de�erlerden bir tanesi bile String ise Java toplama de�il 
		 		Concatenation (Birle�tirme) yapar
		 Kural2 : E�er toplanan de�erlerin ikisi de matematiksel i�lemse Java toplar.
		 
		 Kural3 : E�er say� ve String de�i�kenler birlikte kullan�lacaksa �ncelikler
		 		  belirlenip parantez kullan�labilir.
		 		  
		 kural4 : Matematiksel bir i�lemde char de�i�ken kullan�l�rsa Java char'�n ascii
		 		  de�erini i�leme al�r
		 		  
		 Kural5 : char bir de�i�ken ile String bir de�i�ken toplan�rsa concatenation yapar
		 		
		*/
		
		
		
		
		
		
	}
}
