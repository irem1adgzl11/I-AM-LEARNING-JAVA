package calismaBes;

public class ornek {
//get ve set kullanımı
	private String color;
	private int age;
	
	ornek(String color, int age){
		this.color = color;
		this.age = age;
	}
	
	public String getcolor() {
		return color;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
		
	}
}
