package day05;



public class C2_WrapperClass {

	public static void main(String[] args) {
		
		
		// Java'da 2 tur data türü vardýr
		// Primitive sadece value içeririr
		// Non-Primitive data türleri ise deðer ve methodlarý içeriyor
		
		
		String isim="Bilal";
		
		System.out.println(isim.toUpperCase());
		
		
		
		// Wrapper Class : Java'nýn primitive data türleri ile bazý methodlarý
		//					kullanabilmemiz için oluþturduðu Class'lardýr.
		
		// boolean, char, byte, short, int, long , float, double
		
		
		byte sayi=10;
		System.out.println(sayi);
		Byte sayi2=11; // ismen primitive data türü ile ayný olan non-primitive datalara wrapper denir
		
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		
		System.out.println(byteMaxSayi);
		
		
		// variable oluþturmadan direk olarak shortun en küçük ve en büyük deðerlerini yazdýralým
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		// integer veri türünün wrapper class'ý Integer dýr
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean, Character, Byte, Short, Interger, Long, Float, Double
		
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		
		
		
		
		
		
		
		
	}
	
	
	
}
