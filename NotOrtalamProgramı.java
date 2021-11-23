import java.util.Scanner;

public class NotOrtalamProgramý {

	public static void main(String[] args) {
		int quiz , vize , ffinal ;
		double ortalama;
		Scanner input = new Scanner (System.in);
		System.out.println("quiz notunu girin: ");
		quiz = input.nextInt();
		System.out.println("vizenotunu girin :");
		vize = input.nextInt();
		System.out.println("final notunu girin: ");
		ffinal = input.nextInt();
		
		ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
		System.out.println("not ortalamaýnýz: " + ortalama);
		String sonuc = (ortalama >=50) ? "Geçtiniz" : "kaldýnýz";
		System.out.println(sonuc);
	}

}
