package shape;


public class Rectangle extends Square {
	int width;
	
	Rectangle(int a, int b){
		super(a);
		this.width = b;
	}
	
	@Override
	public void area() {
		int ar = len*width;
		System.out.println("The area of Square is: " + ar);
	}

}
