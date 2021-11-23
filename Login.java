import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k_adi , parola;
		System.out.print("Kullanýcý Adý Giriniz :");
		k_adi = scan.nextLine();
		System.out.print("Parola Giriniz: ");
		parola = scan.nextLine();
		if(k_adi.equals("java")&& parola.equals("123")) {	
	}else {
		System.out.println("Kullanýcý Adýnýz Veya Þifreniz Yanlýþ");
	}

  }
}