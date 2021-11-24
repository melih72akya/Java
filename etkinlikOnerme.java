import java.util.Scanner;

public class etkinlikOnerme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		System.out.print("Hava Sýcaklýðýný Giriniz :");
		sicaklik =scan.nextInt();
		
		if (sicaklik >30) {
			System.out.println("Bu Havada En Ýyi Yüzmeye Gidilir !");
		}else if (sicaklik <= 30 && sicaklik >=5) {
			System.out.println("Bu Havada En Ýyi Sinemaya Gidilir !");
		}else {
			System.out.println("Bu Havada En Ýyi Kayak Yapýlýr  !");
		}
				
	}

}
