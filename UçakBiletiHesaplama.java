import java.util.Scanner;

public class U�akBiletiHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km , yas ,tip = 0;
		System.out.print("Mesafeyi Giriniz : ");
		km = scan.nextInt();
		System.out.print("\nYa��n�z� Giriniz : ");
		yas = scan.nextInt();
		System.out.print("\nYolculuk Tipini Se�iniz (1= Tek Gidi� , 2= Gidi�-D�n��) :" );
		tip = scan.nextInt();
		
		double normalFiyat , yas�ndirimi,tip�ndirimi;
		
		if(km > 0 && yas > 0 && ( tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if(yas<12) {
				yas�ndirimi =normalFiyat * 0.5;
			}else if(yas>=12 && yas <= 24) {
				yas�ndirimi = normalFiyat * 0.10;
			}else if(yas >=65) {
				yas�ndirimi = normalFiyat * 0.30;
			}else {
				yas�ndirimi = 0 ;
			}
			normalFiyat -= yas�ndirimi;
			if(tip==2) {
				tip�ndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat - tip�ndirimi) * 2;
						
			}
			System.out.println("Bilet Tutar� : " + normalFiyat +("$"));
		}else {
			System.out.println("Girdiler Yanl��");
		}
	}

}
	
