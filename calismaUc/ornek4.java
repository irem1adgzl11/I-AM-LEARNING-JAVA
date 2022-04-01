package calismaUc;

public class ornek4 {

	public static void main(String[] args) {
		// Palindrom diziler
     String[] array =  {"alpa" , "beta" , "beta" , "alpa"};
	System.out.println(isPalindrome(array));
	
	}
public static boolean isPalindrome(String[] array) {
	for (int sayac = 0;sayac<array.length; sayac++) {
		if(array[sayac] == array[array.length-1-sayac]) 
			return true;	
		
 }
	return false;
	}
}