package calismaDort;

public class hesapMakinesi {

	public int a;
    public int b;
    public String renk;
    final static double PI = 3.14; //final yazarsak verdiğimiz değeri


    hesapMakinesi(int a, int b, String renk){
    	this.a = a;
    	this.b = b;
    	this.renk = renk;
    	 }
    
    public int toplama() {
    	return a + b ;
    }       
    public int cikarma() {
    	return a - b ;
    }

    public int carpma() {
    	return a * b ;
   
    }

    public int bolme() {
    	return a / b ;
    }

}
