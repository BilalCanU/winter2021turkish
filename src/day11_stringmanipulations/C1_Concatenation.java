package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		
		// concateniton : , JJava'da + iþlemi yapýlýrken eðer toplanan ifadelerden biri veya 
		// her ikisi string ise java toplamý deðil BÝRLEÞTÝRME yapar
		
		

		System.out.println(15+20+"Merhaba"); // 35Merhaba
		System.out.println("Merhaba"+15+20); // Merhaba1520
		System.out.println("Merhaba" + (15+20)); // Merhaba35
		System.out.println("Merhaba" +15*20); // Merhaba300
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1+" "+str2); // Hello World
		System.out.println(str1.concat(str2)); //HelloWorld
		System.out.println(str1.concat(" "+str2)); // Hello World
		System.out.println(str1.concat(" ").concat(str2)); // Hello World
		
		
		
		
		
		
		
		
		
	}

}
