package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri t�r�nde bir de�i�ken olu�turup de�er atay�n
		// olu�turulan variable'� ad�m ad�m AUTO WIDENING ile geni�letip yazd�r�n.
		
		byte numByte= 127;
		
		System.out.println("byte de�i�ken de�eri : " + numByte);
		
		// short yapal�m
		
		short numShort= numByte; // short byte'dan b�y�k oldu�u i�in �ikayet etmiyor..
								 // Auto Widening ile de�eri short variable'a at�yor.
		
		
		System.out.println("short de�i�ken de�eri : " + numByte);
		
		int numInt = numShort;
		
		System.out.println("integer de�i�ken de�eri : " + numInt);
		
		float numFloat = numInt;
		
		System.out.println("float de�i�ken de�eri " + numFloat);
		
		double numDouble = numFloat;
		
		System.out.println("double de�i�ken de�eri " + numDouble);
		
		
		
		
		
	}
	
	
	
}
