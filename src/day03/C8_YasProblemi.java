package day03;

import java.util.Scanner;

public class C8_YasProblemi {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Babanýzýn yaþý sizin yaþýnýzýn 22 fazlasýdýr buna göre ");
		
		System.out.println("sizin yaþýnýz =");
		
		int kendiYasi= scan.nextInt();
		System.out.println("Babanýzýn yaþý =");
		
		int babanýnYasi= kendiYasi+22;
		System.out.println(babanýnYasi);
		
		scan.close();
	}

}
