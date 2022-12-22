package person;


public class StudentMain {

	public static void main(String[] args) {
		String[] s1 = new String[5];
		s1[0] = "Database Management System";
		s1[1] =	"Operating System";
		s1[2] = "Microprocessor";
		s1[3] =	"Math";
		s1[4] = "Software Engineering";
		Student stu1 = new Student("Riya", 20, "123455456", "134", s1);
		Student stu2 = new Student("Sumi", 20, "3476384762", "324", s1);
		
		System.out.println(stu1);
		System.out.println();
		System.out.println(stu2);
	}

}
