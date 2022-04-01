package calismaBes;

public class Student {

	public int id,point;
	public String name;
	private static int counter ;
	
	Student(String name, int id, int point){
		this.name = name;
		this.id = id;
		this.point = point;
		Student.counter++ ;// her nesne ürettiğimizde counter 1 artar böylelikle kaç 
		//nesne ürettiğimizi sayar
	}
	public void exit() {
		Student.counter--;//nesne siler
	}
	public static int howStudent() {
		return Student.counter;//
	}
	public static double calcOverall(int []arr) {// ortalama hesaplıyor
		double overall = 0;
		for(int i = 0; i < arr.length; i++){
			overall += arr[i];
		}
		return overall / arr.length;
	}
}
