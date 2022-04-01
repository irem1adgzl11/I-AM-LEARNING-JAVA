package calismaBes;

public class ornekMain {

	public static void main(String[] args) {
		ornek o1 = new ornek("mavi",20);
		
		System.out.println(o1.getage());
		System.out.println(o1.getcolor());
		
		o1.setage(3);
		System.out.println(o1.getage());
	}

}
