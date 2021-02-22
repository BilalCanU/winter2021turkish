package day07_ifElsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// 
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 2 sayý giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		if (sayi1==0 || sayi2 ==0) {
			System.out.println("Sýfýr çarpmaya göre yutan elemandýr!");
		} else if (sayi1>0 && sayi2>0) {
			System.out.println("sayýlarýn toplamý: " +(sayi1+sayi2));
		}  else if (sayi1<0 && sayi2<0) {
			System.out.println("sayýlarýn çarpýmý" + (sayi1*sayi2));
		} else {
			System.out.println("Farklý iþaretlerde sayýlarla iþlem yapamazsýn");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
