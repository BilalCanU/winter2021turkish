package day03;

public class C4_DataCasting2 {

	public static void main(String[] args) {
		
		// Data Casting Daralma
		
		
		// double bir de�i�ken olu�tural�m ve bunu int ve sonra da byte'a �evirin
		
		double numDouble = 128.56;
		// double'dan integer'a ge�erken e�er say�da ondal�kl� bir b�l�m varsa 
		// Java ondal�kl� b�l�m� siler (yok sayar)
		
		
		int numInt = (int)numDouble;
		
		System.out.println("integer de�i�ken de�eri : " + numInt);
		
		byte numByte = (byte)numInt; 
		// daha dar (narrow) bir data tipine �evirirken e�er data tipinin s�n�r�ndan b�y�kse saymaya 
		// negatif en k���k say�dan devam eder, istenen say�ya gelinceye kadar tekrar tekrar en k���k negatif say�ya gider
		
		
		System.out.println("byte de�i�ken de�eri : " + numByte);
		
		
		
		
		
		
	}
}
