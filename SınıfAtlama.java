import java.util.Scanner;

public class S�n�fAtlama {

	public static void main(String[] args) {
		int turkce,matematik,fenBilgisi,sosyalBilgisi,beden;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("T�rk�e notunu giriniz :");
		turkce = scan.nextInt();
		System.out.print(" \nMatematik notunu giriniz :");
		matematik = scan.nextInt();
		System.out.print("\nFen Bilgisi notunu giriniz :");
		fenBilgisi = scan.nextInt();
		System.out.print("\nSosyal Bilgisi notunu giriniz :");
		sosyalBilgisi = scan.nextInt();
		System.out.print("\nBeden notunu giriniz :");
		beden = scan.nextInt();
		ortalama = (turkce+matematik+fenBilgisi+sosyalBilgisi+beden) /5;
		if(ortalama<50) {
			System.out.println("S�n�fta kald�n�z !");
	}else {
		System.out.println("Tebrikler S�nf� Ge�tiniz !");
	}
		System.out.println("S�n�f Ortalamas� : " + ortalama);
  }
}
