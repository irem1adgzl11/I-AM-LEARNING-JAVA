package yeniClisma;

import java.util.Scanner;

public class ornek3 {

	public static void main(String[] args) {
		//SICAKLIĞA GÖRE ETKİNLİK ÖNEREN PROGRAM
		// Hava sıcaklığı al
		//Sıcaklık 30 veya daha yüksek ise yüzme etkinliğini öner
		//5 ile 30 arasında ise sinema öner
		//4 veya daha yüksek ise kayak yapmayı öner
		Scanner input = new Scanner(System.in);
		int sicaklik ;
		System.out.println("Hava sıcaklığını giriniz: ");
		sicaklik = input.nextInt();
		
	     if(sicaklik>=30) {
			System.out.print("Bu havada yüzmeye gidilir");
			}
		else if (sicaklik<30 && sicaklik>5){
			System.out.print("Bu havada sinemaya gidilir");
		}
		else{
				System.out.print("Bu havada kayak yapmaya gidilir");
			}
			
	}
	

}
