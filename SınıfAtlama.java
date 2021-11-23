import java.util.Scanner;

public class SýnýfAtlama {

	public static void main(String[] args) {
		int turkce,matematik,fenBilgisi,sosyalBilgisi,beden;
		double ortalama=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Türkçe notunu giriniz :");
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
			System.out.println("Sýnýfta kaldýnýz !");
	}else {
		System.out.println("Tebrikler Sýnfý Geçtiniz !");
	}
		System.out.println("Sýnýf Ortalamasý : " + ortalama);
  }
}
