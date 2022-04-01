package calismaDort;

import java.util.Scanner;

public class diziler {

	public static void main(String[] args) {
		// Dizideki elemanların ortalaması
         
		int []dizi = new int [7];
		double sonuc = 0;
		int toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hoşgeldiniz lütfen notlarınızı giriniz: ");
		
		System.out.println("Matematik notu: ");
		dizi[0] = input.nextInt();
		System.out.println("Türkçe notu: ");
		dizi[1] = input.nextInt();
		System.out.println("Fizik notu: ");
		dizi[2] = input.nextInt();
		System.out.println("Kimya notu: ");
		dizi[3] = input.nextInt();
		System.out.println("Tarih notu: ");
		dizi[4] = input.nextInt();
		System.out.println("Biyoloji notu: ");
		dizi[5] = input.nextInt();
		System.out.println("Coğrafya notu: ");
		dizi[6] = input.nextInt();
		
	
	for (int not : dizi) { //burada ne yaptık anlamadım
		toplam += not ;
	}
	System.out.println("Ortalamanız : " + (toplam/dizi.length));
	}

}
