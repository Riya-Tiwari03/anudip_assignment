package member;

// this class is created to call the main function and make instances of all the classes declared according to the use 
public class MemberMain {

	public static void main(String[] args) {
		Address add = new Address(23, "Pi 1", "Noida");
		Address add1 = new Address(23, "Delta 2", "Noida");
		Employee em = new Employee("Riya", 20, "1234567890", add, "40,000", "Web Devlopment", "Technical");
		Manager man = new Manager("Sumit", 20, "1234567890", add1, "40,000", "Human Resources", "HR");
		
		em.print();
		System.out.println();
		man.print();
		
	}

}
