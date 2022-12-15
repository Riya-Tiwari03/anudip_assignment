package member;

//declaring and intializing the methods and variables in member class/ parent class
public class Member {
	String name;
	int age;
	String phoneNum;
	Address add;
	String salary;
	
	Member(String name, int age, String phonenum, Address add, String salary){
		this.name = name;
		this.age = age;
		this.phoneNum = phonenum;
		this.add = add;
		this.salary = salary;
	}
	
	void printsalary() {
		System.out.println("The salary is: " + salary);
	}
}
