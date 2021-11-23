
public class Operatorler {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 5 ;
		int toplama = a + b ;
		int cikarma = a - b ;
		int carpma = a * b ;
		int bolme = a / b ;
		int mod = a % b ;
		
		//System.out.println("Toplama " + toplama);
		//System.out.println("Çýkarma " + cikarma);
		//System.out.println("Çarpma" + carpma);
		//System.out.println("Bölme " + bolme);
		//System.out.println("Mod " + mod);
		toplama++;
		//System.out.println(toplama);
		cikarma--;
		//System.out.println(cikarma);
		
		int sonuc = ++a + --b;
		//System.out.println(sonuc);
		//System.out.println(a);
		//System.out.println(b);
		
		int sayi1 = 10 ;
		int sayi2 = 5 ;
		
		boolean kosul = (sayi1 / sayi2) ==2 ;
		System.out.println(kosul);
		
		boolean kosul1 = (sayi1 > sayi2 );
		System.out.println(kosul1);
		boolean kosul2 = (sayi1 < sayi2 );
		System.out.println(kosul2);
		
		boolean sonuc1 = kosul1 && kosul2;
		System.out.println(sonuc1);
		
		sonuc1 = kosul1 || kosul2 ;
		System.out.println(sonuc1);
		
		String sonuc2 = (a==b) ? "Doðru" : "Yanlýþ" ;
		System.out.println(sonuc2);
		
		sayi1 = sayi2 ;
		System.out.println(sayi1);
		sayi1 += 2;
		System.out.println(sayi1);
		
		
		
		
	
			

	}

}
