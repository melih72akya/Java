import java.util.Scanner;

public class UçakBiletiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km , yas ,tip = 0;
		System.out.print("Mesafeyi Giriniz : ");
		km = scan.nextInt();
		System.out.print("\nYaşınızı Giriniz : ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk Tipini Seçiniz (1= Tek Gidiş , 2= Gidiş-Dönüş) :" );
		tip = scan.nextInt();
		
		double normalFiyat , yasİndirimi,tipİndirimi;
		
		if(km > 0 && yas > 0 && ( tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if(yas<12) {
				yasİndirimi =normalFiyat * 0.5;
			}else if(yas>=12 && yas <= 24) {
				yasİndirimi = normalFiyat * 0.10;
			}else if(yas >=65) {
				yasİndirimi = normalFiyat * 0.30;
			}else {
				yasİndirimi = 0 ;
			}
			normalFiyat -= yasİndirimi;
			if(tip==2) {
				tipİndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tipİndirimi) * 2;
						
			}
			System.out.println("Bilet Tutarı : " + normalFiyat +("$"));
		}else {
			System.out.println("Girdiler Yanlış");
		}
	}

}
	
