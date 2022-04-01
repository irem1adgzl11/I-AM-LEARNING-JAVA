package calismaUc;

public class ornek3 {

	public static void main(String[] args) {
		// Recursive(özyineli) metodlar
   System.out.println(r(5));
	}
static int r(int x) {
	if(x == 1) {
		return 1;
	}
	return x + r(x-1);
}
}