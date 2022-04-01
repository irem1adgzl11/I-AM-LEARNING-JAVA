package calismaUc;

public class ornek1 {

	public static void main(String[] args) {
		// metodlar 
	     f(4);
	    // System.out.println("İkinci metod");	
	     power(2,4);
		}
	static void  f(int x) {
		int result = (x + 2) * 6;
		System.out.println(result);	
	}
	   static void power(int number1, int number2) { //üs alan program 
		int result = 1;
		for(int i = 1;i <= number2; i++) {
			result *= number1;
		}
		System.out.println("Cevap: " + result);
	}

}
