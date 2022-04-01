package calismaBes;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("Onine öğrenci: "+ Student.howStudent());
		
		Student s1 = new Student("Ali", 001,100);
		Student s2 = new Student("Ayşe", 002, 70);
		Student s3 = new Student("Mehmet", 003, 60);
		Student s4 = new Student("Lale", 004, 90);
				System.out.println("Onine öğrenci: "+ Student.howStudent());

		int [] notlar = new int [4];
        notlar[0] = s1.point; 	
        notlar[1] = s2.point;
        notlar[2] = s3.point;
        notlar[3] = s4.point;
        
        System.out.println(Student.calcOverall(notlar));//notların ortalaması
        }

}
