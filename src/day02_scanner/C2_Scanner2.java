package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		// kullan�c�dan dairenin yar��ap�n� isteyin ve dareinin alan�n� yazd�r�n
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alan�n� hesaplamak i�in Dairenin yar��ap�n� yaz�n�z");
		
		
		// kullan�c�dan yar��ap istedim,
		// �nce kullan�c�n�n girdi�i yar��ap� i�ine koyabilece�im bir de�i�ken olu�turmal�y�m
		
		double yaricap=scan.nextDouble();
		
		float pi = 3.14159f;
        
		
		System.out.println("Dairenin alan�= " + yaricap*yaricap*pi);
				
		scan.close();
	}

}
