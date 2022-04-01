package yeniClisma;

import java.util.Scanner;

public class ornek2 {

	public static void main(String[] args) {
		//UÇAK BİLETİ FİYATI HESAPLAYAN PROGRAM
		// km birim fiyatı :0,10
		//12 yaşından küçükse toplam fiyata %50 indirim
		//12 ve 24 yaş arasında ise %10 indirim
		//65 yaşından büyükse %30 indirim
		//Gidiş dönüş alırsa %20 indirim
		//Bu koşullara göre uçak bileti fiyatı hesaplayan program
		Scanner input = new Scanner(System.in);
		int km,yas,tip;
		System.out.print("Mesafeyi giriniz: ");
		km = input.nextInt();
		System.out.print("Bilet tipi giriniz(1=Tek yön,2=Gidiş-Dönüş): ");
		tip = input.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();
		double normalFiyat,yasIndirimi,tipIndirimi;
	if(km>0 && yas>0 && (tip==1||tip==2)) {
		normalFiyat = km*0.10;
		    
		if(yas<12) {
			yasIndirimi = normalFiyat * 0.5;//İndirimi hesaplıyoruz 
			  
		}else if(yas<=24 && yas>=15) {
				yasIndirimi = normalFiyat * 0.1;
				
		}else if(yas>=65) {
				yasIndirimi = normalFiyat * 0.3;
				
				}else {
					yasIndirimi=0;
				}
		normalFiyat -= yasIndirimi;//İndirimi normal fiyattan düşüyoruz. normalFiyat = normalFiyat-yasIndirimi;
		 if(tip==2) {
				tipIndirimi = normalFiyat * 0.2;
				normalFiyat = (normalFiyat-tipIndirimi) * 2;		
				}
	    System.out.println("Bilet tutarı: " + normalFiyat + "$"); 
	    }else {
	            System.out.println("Girdiler hatalı lütfen doğru giriniz");
				}
		

	}

}
