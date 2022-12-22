package shape;
import java.util.*;
public class Square implements Shape {

	Scanner sc = new Scanner(System.in);
	int len;
	
	Square(int l){
		this.len = l;
	}
	
	@Override
	public void area() {
		int ar = len*len;
		System.out.println("The area of Square is: " + ar);
	}


}