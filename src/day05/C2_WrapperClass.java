package day05;



public class C2_WrapperClass {

	public static void main(String[] args) {
		
		
		// Java'da 2 tur data t�r� vard�r
		// Primitive sadece value i�eririr
		// Non-Primitive data t�rleri ise de�er ve methodlar� i�eriyor
		
		
		String isim="Bilal";
		
		System.out.println(isim.toUpperCase());
		
		
		
		// Wrapper Class : Java'n�n primitive data t�rleri ile baz� methodlar�
		//					kullanabilmemiz i�in olu�turdu�u Class'lard�r.
		
		// boolean, char, byte, short, int, long , float, double
		
		
		byte sayi=10;
		System.out.println(sayi);
		Byte sayi2=11; // ismen primitive data t�r� ile ayn� olan non-primitive datalara wrapper denir
		
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		
		System.out.println(byteMaxSayi);
		
		
		// variable olu�turmadan direk olarak shortun en k���k ve en b�y�k de�erlerini yazd�ral�m
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// integer veri t�r�n�n wrapper class'� Integer d�r
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean, Character, Byte, Short, Interger, Long, Float, Double
		
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		
		
		
		
		
		
		
		
	}
	
	
	
}
