import java.util.Scanner;

public class etkinlikOnerme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		System.out.print("Hava S�cakl���n� Giriniz :");
		sicaklik =scan.nextInt();
		
		if (sicaklik >30) {
			System.out.println("Bu Havada En �yi Y�zmeye Gidilir !");
		}else if (sicaklik <= 30 && sicaklik >=5) {
			System.out.println("Bu Havada En �yi Sinemaya Gidilir !");
		}else {
			System.out.println("Bu Havada En �yi Kayak Yap�l�r  !");
		}
				
	}

}
