package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		
		// charAt(index) 
		// scan.next().charAt(0) 0. indexdeki karakteri verir
		// index 0'dan ba�lar 
		
		
		
		String str="Java �ok G�zel";// uzunlu�u 14
		System.out.println(str.charAt(0)); // J
		System.out.println(str.charAt(5)); // �
		System.out.println(str.charAt(13)); // l
		// kelimenin uzunlu�u son index+1 dir
		// son index kelimenin uzunlu�u(length)-1 dir
		
		// kullan�c� 10 harfli bir kelime girerse 
		// bana son harfi verecek kodu yaz�n�z
		// str.charAt(9);
		
		//System.out.println(str.charAt(15)); exception verir
		// e�er index olarak String'in uzunlu�u veya daha b�y�k bir say� girilirse
		
		
		
		//String str3= 5 // Compile Time Error CTE
					   	// kod �al�madan Java'n�n fark�na var�p alt�n� k�rm�z� ile �izdi�i
						// derleme zaman hatas�
		
		
	}
}
