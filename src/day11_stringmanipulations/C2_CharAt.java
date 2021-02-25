package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		// charAt(index) 
		// scan.next().charAt(0) 0. indexdeki karakteri verir
		// index 0'dan baþlar 
		
		
		
		String str="Java Çok Güzel";// uzunluðu 14
		System.out.println(str.charAt(0)); // J
		System.out.println(str.charAt(5)); // Ç
		System.out.println(str.charAt(13)); // l
		// kelimenin uzunluðu son index+1 dir
		// son index kelimenin uzunluðu(length)-1 dir
		
		// kullanýcý 10 harfli bir kelime girerse 
		// bana son harfi verecek kodu yazýnýz
		// str.charAt(9);
		
		//System.out.println(str.charAt(15)); exception verir
		// eðer index olarak String'in uzunluðu veya daha büyük bir sayý girilirse
		
		
		
		//String str3= 5 // Compile Time Error CTE
					   	// kod çalþmadan Java'nýn farkýna varýp altýný kýrmýzý ile çizdiði
						// derleme zaman hatasý
		
		
	}
}
