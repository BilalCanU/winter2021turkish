package day05;

public class C6_ModulusDeneme {

	public static void main(String[] args) {
		
		
		int fetih =1453;
		
		int fetihbirler= fetih % 10 ;
		
		System.out.println("Birler Basama��:"+ " " + fetihbirler); // sonu� 3 yazd�r�r
		
		
		fetih /= 10; // 145
		
		System.out.println("Onlar Basama��:"+ " " +fetih % 10);
		
		fetih /= 10; // 14 
		
		System.out.println(fetih);
		
		System.out.println(fetih %10);
		
		fetih /= 10; // 1 yeni say�
		
		System.out.println(fetih %10);
		
		
		
		
		
		
	}

}
