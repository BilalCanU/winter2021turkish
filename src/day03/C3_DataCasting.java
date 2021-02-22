package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri türünde bir deðiþken oluþturup deðer atayýn
		// oluþturulan variable'ý adým adým AUTO WIDENING ile geniþletip yazdýrýn.
		
		byte numByte= 127;
		
		System.out.println("byte deðiþken deðeri : " + numByte);
		
		// short yapalým
		
		short numShort= numByte; // short byte'dan büyük olduðu için þikayet etmiyor..
								 // Auto Widening ile deðeri short variable'a atýyor.
		
		
		System.out.println("short deðiþken deðeri : " + numByte);
		
		int numInt = numShort;
		
		System.out.println("integer deðiþken deðeri : " + numInt);
		
		float numFloat = numInt;
		
		System.out.println("float deðiþken deðeri " + numFloat);
		
		double numDouble = numFloat;
		
		System.out.println("double deðiþken deðeri " + numDouble);
		
		
		
		
		
	}
	
	
	
}
