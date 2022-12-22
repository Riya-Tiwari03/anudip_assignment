package person;

public class Person {
		String name;
		int age;
		String mob;
		
		Person(){
			
			System.out.println("This is default constructor of person class");
		}
		
		Person(String n, int a, String m){
			this.name = n;
			this.age = a;
			this.mob = m;
		}

}
