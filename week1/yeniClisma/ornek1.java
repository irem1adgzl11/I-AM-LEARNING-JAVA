package yeniClisma;

import java.util.Scanner;

public class ornek1 {

	public static void main(String[] args) {
		//NOT ORTALAMASINI VE GEÇİP GEÇMEDİĞİNİ HESAPLAYAN PROGRAM
		// Turkce,matematik,beden eğitimi,fen bilgisi,sosyal bilgiler notları girilisin
		//Notların ort. hesaplansın
        //Ort. 50 den yüksek ise sınıftan geçsin değil ise kalsın.
		
		Scanner input =new Scanner(System.in);
		
		double ortalama = 0;
		int turkce,matematik,beden,sosyal,fen ;
		
		System.out.println("Türkçe notunu giriniz: ");
		turkce = input.nextInt();
		System.out.println("Matematik notunu giriniz: ");
		matematik = input.nextInt();
		System.out.println("Fen bilgisi notunu giriniz: ");
		fen = input.nextInt();
		System.out.println("Beden eğitmi notunu giriniz: ");
		beden = input.nextInt();
		System.out.println("Sosyal bilgiler notunu giriniz: ");
		sosyal =input.nextInt();
		
		ortalama = (turkce+matematik+fen+sosyal+beden)/5;
		System.out.println("Ortalama: " + ortalama);
		
		if(ortalama<50) {
		System.out.println("Kaldı!");
		}
		else {
			System.out.println("Geçti");
		
		}
		
	}

}
