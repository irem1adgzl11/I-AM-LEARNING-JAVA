package yeniClisma;

import java.util.Scanner;

public class ornek4 {

	public static void main(String[] args) {
		// Sayıları küçükten büyüğe sıralayan program
		//Eğer A büyük ise A>B>C veya A>C>B olmalı
		//Eğer B büyük ise B>A>C veya B>C>A olmalı
		//Eğer C büyük ise C>B>A veya C>A>B olmalı
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Sayıları giriniz: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if(a==b && b==c) {
		System.out.print("a=b=c");
		}
		
	if(a>b && a>c) {
		 if(b>c) {
			System.out.println("a>b>c");
		}else {
			System.out.println("a>c>b");
		}
	}
	
	if(b>c && b>a) {
		if(c>a) {
			System.out.print("b>c>a");
		}else {
			System.out.println("b>a>c");
		}
	}
	
	if(c>a && c>b) {
		if(a>b) {
			System.out.println("c>a>b");
		}else {
			System.out.println("c>b<a");
		}
	}
	
	
	
	
	}
}
