package calismaUc;

public class ornek2 {

	public static void main(String[] args) {
		//int double içeren isimleri aynı fakat değer sıraları farklı olan metodlarda java hangi metodu
		//kullanacağını bilir.
	System.out.println(add(2,4));
	System.out.println(add(2,4,5));
	System.out.println(add(2,4,5.8));
	System.out.println(add(2,3.5,4));
	
	}
	static int add(int a, int b) {
	System.out.println("1.metod");
		return a+b;
}
	static int add(int a, int b, int c) {
		System.out.println("2.metod");
			return a+b+c;
	}
	static double add(int a, double b, int c) {
		System.out.println("3.metod");
			return a+b+c;
	}
	static double add(int a, int b, double c) {
		System.out.println("4.metod");
			return a+b+c;
	}
}
