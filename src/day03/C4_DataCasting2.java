package day03;

public class C4_DataCasting2 {

	public static void main(String[] args) {
		
		// Data Casting Daralma
		
		
		// double bir deðiþken oluþturalým ve bunu int ve sonra da byte'a çevirin
		
		double numDouble = 128.56;
		// double'dan integer'a geçerken eðer sayýda ondalýklý bir bölüm varsa 
		// Java ondalýklý bölümü siler (yok sayar)
		
		
		int numInt = (int)numDouble;
		
		System.out.println("integer deðiþken deðeri : " + numInt);
		
		byte numByte = (byte)numInt; 
		// daha dar (narrow) bir data tipine çevirirken eðer data tipinin sýnýrýndan büyükse saymaya 
		// negatif en küçük sayýdan devam eder, istenen sayýya gelinceye kadar tekrar tekrar en küçük negatif sayýya gider
		
		
		System.out.println("byte deðiþken deðeri : " + numByte);
		
		
		
		
		
		
	}
}
