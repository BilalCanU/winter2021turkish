package day04;

public class C1_matematikselIslemler {

	
	public static void main(String[] args) {
		
		
		int num1= 38/2*(4+3)*2; // 266
		
		System.out.println(num1);
		
		
		int num2= 8+2*(14-6/2)-12; // 18
		
		System.out.println(num2);
		
		int num3=10;
		
		
		double num4=num1*num2/num3; // 478.0  // e�itli�in sa��ndaki b�t�n de�erler int t�r�nde oldu�u i�in
									// ��kt�s�n� ald���m�zda tam say� olarak ��kar�r
		
		System.out.println(num4); 
		
		
		double num5=24.56;
		double num6=14.2;
		
		double num7= num5/num6;
		
		System.out.println(num7); // 1.7295774647887323
		
		
		System.out.println(num5/num3);  // 2.456
		
		double num8= (double) num1*num2/num3; // 478.8 // e�itli�in sa��na parantez i�inde double eklersek e�er 
											  // ��kt�s�n� ald���m�zda kesirli olarak verir sonucu
		
		
		System.out.println(num8);
		
		
		
		
		
		
		
	}
}
