package day08_ifElseİfNestedİf;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		
		
		// kullanıcıdan gün ismini yazmasını isteyin.
		// girilen isim geçerli bir gün ise gün
		// isminin 1.,2 ve 3. harflerini ilk harf büyük diğer ikisi küçük olarak yazındırın,
		// gün ismi geçerli değilse "geçerli gün ismi giriniz" yazdırın
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Gün ismini giriniz");
		
		String gunİsmi = scan.nextLine(); // girilen tüm yazıyı küçük yapacak
		
		if (gunİsmi.equalsIgnoreCase("pazar") || gunİsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gunİsmi.equalsIgnoreCase("salı")) {
			System.out.println("Sal");
		} else if (gunİsmi.equalsIgnoreCase("çarşamba")) {
			System.out.println("Çar");
		} else if (gunİsmi.equalsIgnoreCase("perşembe")) {
			System.out.println("Per");
		} else if (gunİsmi.equalsIgnoreCase("cuma") || gunİsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("Sadece gün ismi giriniz");
		} 
		
		 // equalsIgnoreCase() :  methodu iki string'in büyük, küçük harf hassasiyeti olmadan
		 // eşit olup olmadığını kontrol eder.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
