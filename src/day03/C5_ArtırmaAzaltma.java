package day03;

public class C5_ArtırmaAzaltma {

	
	public static void main(String[] args) {
		
		
		int num = 15;
		
		// bir sayıyı 2 artırmak istersek sayıyı iki ile toplarız
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
		
		num=num+5;// num =20 
				 // eşitliğin solunda num dazdığımızda eşitliğin sağındaki işlemde sonuç num
				 // num variable'ına atarnı. Bu satırdan SONRA num=20'dir
		
		System.out.println("16.satırdan sonra num = " + num); 
		
		System.out.println(num+12); // 32
		
		// bir sayıyı artırmak (increment) istersek o sayıya istediğimiz sayıyı ekler ve sonucu
		// variable'a atarız
		
		//num'ı 8 artırın
		
		num = num+8; // num =28
		
		// num'ı 5 artırın
		
		num +=5; // num =33
		
		System.out.println("Javanın pratik artışından sonra num = " + num);
		
		
		// num'ı 10 artıralım
		
		num +=10; // num =43
		
		// num'ı 1 artırın
		
		//num = num + 1;
		num +=1; //  num =44
		
		// sadece 1 artırmaya özel olarak Java pratik method 
		
		num++; // num =45
		
		System.out.println("num'ın son hali : " + num);
		
		
		
		
		
		
		
		
		
		
		
	}
}
