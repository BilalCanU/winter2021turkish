package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		// AND &&, or 
		// AND operat�r� m�kemmelliyet�idir. Hepsi true olursa sonucu true yapar, bir tane
		// bile false olsa sonucu false yapar.
		// Matematikteki �arpma i�lemi gibidir (true=1 false=0)
		
		boolean isTrue= 5>4 && 7-3>0;
		
		System.out.println(isTrue); // true
		
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true
		
		System.out.println(x+y<0 && x-y>0); // false
		
		
		// OR operat�r� ise optimisttir.
		// verilen kar��la�t�rmalardan 1 tanesi bile do�ru ise sonu� true olur
		
	
		System.out.println(x<y || x+y<0 || x*y>0); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
