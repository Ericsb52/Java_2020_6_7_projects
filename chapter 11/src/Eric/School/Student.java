package Eric.School;

import java.util.Random;
import java.util.Scanner;

public class Student {
	Scanner input = new Scanner(System.in);
	static int totalStudents;
	private String name;
	private String idnum;
	private String bday;
	private double gpa;
	private String healthcon;
	private String address;
	private int grade;
	private int lunch_num;
	private String email;
	private Classes[] classes = new Classes[10];
	private String phone;
	
	private void pickClasses() {
		
		String[] classList = {"Math",
				"English",
				"History",
				"Science",
				"programming_Java",
				"programming_python",
				"programming_c_sharp",
				"PE",
				"Pro_Start",
				"cosmo",
				"health",
				"quier",
				"internship",
				"accounting",
				"business",
				"Auto_shop",
				"Wood_shop",
				"Metal_shop",
				"A_plus"};
		
		for(int i =0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("what class would you like for period 1");
		String inputclass = input.nextLine();
		if (inputclass.equals("math")) {
			classes[0] = Classes.Math;
		}
		else if (inputclass.equals("english")) {
			classes[0] = Classes.English;
		}
		else {
			classes[0] = Classes.programming_Java;
		}
		
		
	}
	
	public Student(String name, String idnum, String bday, double gpa, String health, String address, int grade,
			int lunch_num, String email, String phone) {
		super();
		this.name = name;
		this.idnum = idnum;
		this.bday = bday;
		this.gpa = gpa;
		this.healthcon = health;
		this.address = address;
		this.grade = grade;
		this.lunch_num = lunch_num;
		this.email = email;
		this.phone = phone;
		totalStudents ++;
	}

	public Student(double gpa, int grade) {
		super();
		this.gpa = gpa;
		this.grade = grade;
		totalStudents ++;
	}
	private String genId() {
		Random rand = new Random(); 
		int num1  = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2  = rand.nextInt(10);
		String pos2 = Integer.toString(num2);
		int num3  = rand.nextInt(10);
		String pos3 = Integer.toString(num3);
		int num4  = rand.nextInt(10);
		String pos4 = Integer.toString(num4);
		int num5  = rand.nextInt(10);
		String pos5 = Integer.toString(num5);
		int num6  = rand.nextInt(10);
		String pos6 = Integer.toString(num6);
		int num7  = rand.nextInt(10);
		String pos7 = Integer.toString(num7);
		int num8  = rand.nextInt(10);
		String pos8 = Integer.toString(num8);
		String id = pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8;
		return id;
		
	}
	
	private int genLunchnum(String id, int grade) {
		 int lunchnum;
		 String x = id + Integer.toString(grade);
		 lunchnum = Integer.parseInt(x);

		 return lunchnum;
	}

	public Student() {
		totalStudents ++;
		setIdnum(genId());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		setName(input.nextLine());
		System.out.println("Enter your BDay");
		setBday(input.nextLine());
		System.out.println("Enter your GPA");
		setGpa(input.nextDouble());
		input.nextLine();
		System.out.println("Enter your Health conditions");
		setHealth(input.nextLine());
		System.out.println("Enter your Address");
		setAddress(input.nextLine());
		System.out.println("Enter your grade");
		setGrade(input.nextInt());
		input.nextLine();
		System.out.println("Enter your email");
		setEmail(input.nextLine());
		System.out.println("Enter your phone #");
		setPhone(input.nextLine());
		setLunch_num(genLunchnum(this.idnum, this.grade));
		pickClasses();
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getHealth() {
		return healthcon;
	}

	public void setHealth(String health) {
		this.healthcon = health;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getLunch_num() {
		return lunch_num;
	}

	public void setLunch_num(int lunch_num) {
		this.lunch_num = lunch_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student(String name) {
		this.name = name;
	}

}
