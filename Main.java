import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz ! ");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz ! ");
		//System.out.print("Satýr Sayýsý : ");
		//row = scan.nextInt();
		//System.out.print("Sutün Sayýsý : ");
		//column = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(5,5);
		mayin.run();
	}

}
