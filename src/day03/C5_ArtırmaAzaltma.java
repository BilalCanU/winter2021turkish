package day03;

public class C5_Art�rmaAzaltma {

	
	public static void main(String[] args) {
		
		
		int num = 15;
		
		// bir say�y� 2 art�rmak istersek say�y� iki ile toplar�z
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		
		num=num+5;// num =20 
				 // e�itli�in solunda num dazd���m�zda e�itli�in sa��ndaki i�lemde sonu� num
				 // num variable'�na atarn�. Bu sat�rdan SONRA num=20'dir
		
		System.out.println("16.sat�rdan sonra num = " + num); 
		
		System.out.println(num+12); // 32
		
		// bir say�y� art�rmak (increment) istersek o say�ya istedi�imiz say�y� ekler ve sonucu
		// variable'a atar�z
		
		//num'� 8 art�r�n
		
		num = num+8; // num =28
		
		// num'� 5 art�r�n
		
		num +=5; // num =33
		
		System.out.println("Javan�n pratik art���ndan sonra num = " + num);
		
		
		// num'� 10 art�ral�m
		
		num +=10; // num =43
		
		// num'� 1 art�r�n
		
		//num = num + 1;
		num +=1; //  num =44
		
		// sadece 1 art�rmaya �zel olarak Java pratik method 
		
		num++; // num =45
		
		System.out.println("num'�n son hali : " + num);
		
		
		
		
		
		
		
		
		
		
		
	}
}
