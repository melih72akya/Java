import java.util.Scanner;

public class DaireAlanHesaplama {

	public static void main(String[] args) {
		int r;
		double alan , hacim , pi=3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.print("daire yar��ap�n� girin: \n");
		r = input.nextInt();
		alan = 2*pi*r;
		hacim = pi*(r*r);
		System.out.println("dairenin alan� : " + alan);
		System.out.println("dairenin hacmi :" + hacim);
	}

}
