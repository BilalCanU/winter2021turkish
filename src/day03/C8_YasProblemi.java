package day03;

import java.util.Scanner;

public class C8_YasProblemi {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baban�z�n ya�� sizin ya��n�z�n 22 fazlas�d�r buna g�re ");
		
		System.out.println("sizin ya��n�z =");
		
		int kendiYasi= scan.nextInt();
		System.out.println("Baban�z�n ya�� =");
		
		int baban�nYasi= kendiYasi+22;
		System.out.println(baban�nYasi);
		
		scan.close();
	}

}
