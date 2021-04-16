package Eric.School;

public class School {

	public School() {
		//Student eric_B = new Student();
		Student.totalStudents += 10;
		System.out.println(Student.totalStudents);
		Student Austin = new Student(2.8,11);
		System.out.println(Student.totalStudents);
		Student bob = new Student("bob", "1", "2",0.0, "na", "123", 9,1, "i@a", "12345657890");
		System.out.println(Student.totalStudents);
	}

	public static void main(String[] args) {
		new School();

	}
	public static void create_student() {
		
	}

}
