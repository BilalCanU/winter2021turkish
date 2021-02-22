package day05;

public class C6_ModulusDeneme {

	public static void main(String[] args) {
		
		
		int fetih =1453;
		
		int fetihbirler= fetih % 10 ;
		
		System.out.println("Birler Basamaðý:"+ " " + fetihbirler); // sonuç 3 yazdýrýr
		
		
		fetih /= 10; // 145
		
		System.out.println("Onlar Basamaðý:"+ " " +fetih % 10);
		
		fetih /= 10; // 14 
		
		System.out.println(fetih);
		
		System.out.println(fetih %10);
		
		fetih /= 10; // 1 yeni sayý
		
		System.out.println(fetih %10);
		
		
		
		
		
		
	}

}
