package calismaBes;

public class Car {
 
	private int enginePower,model;//alt sınıflar dahil hiçbir sınıf erişemez
	public int speed; //bütün sınıflar erişebilir
	protected String color;// alt sınıflar ve aynı pakettekiler erişebilir
	
	Car (){
		this.model = 2020;
		this.enginePower = 300;
		this.speed = 120;
		this.color = "red";
	}
	public void print() {
		System.out.println(model);
	}
}
