package peope.classes;

import java.util.Scanner;

public class ParentClass {
	private String hairColor = "Brown";
	private int age;
	private String gender;
	private String eyeColor = "Blue";
	private int weight;
	private double height;
	private String ethnicity = "white";
	
	

	public ParentClass() {
		// TODO Auto-generated constructor stub
	}
	public void speak(String message) {
		System.out.println(message);
	}
	public void run() {
		System.out.println("running");
	}
	public void jump() {
		System.out.println("Jummping");
	}
	public String getEthnicity() {
		String password = "123456";
		Scanner input = new Scanner(System.in); 
		String my_password = "";
		try {
			System.out.println("enter the password");
			my_password = input.nextLine();
		}
		catch(Exception e) {
			System.out.println("Somthing went wrong");
		}
		if (my_password == password) {
			return ethnicity;
		}
		else {
			System.out.println("wrong password");
			return "not permitted";
		}
		
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}
