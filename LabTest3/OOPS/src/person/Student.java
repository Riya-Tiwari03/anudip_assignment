package person;

import java.util.Arrays;

public class Student extends Person{
	static final String INSTITUTE_NAME = "United College of Engineering and Research";
	String rollno;
	String[] subjects;
	
	
	Student(){
		System.out.println("Default constructor of student class");
	}
	
	Student(String n, int a, String m, String r, String[] s){
		super(n, a, m);
		this.rollno = r;
		this.subjects = s;
	}

	@Override
	public String toString() {
		return "Name: " + this.name +  "\nInstitute Name: "+INSTITUTE_NAME + "\nAge: " + this.age + "\nMobileNumber: " + this.mob + "\nRoll number: " + this.rollno + "\nSubjects: " + Arrays.toString(this.subjects);
	}
}
