package shape;

public class ShapeMain {
	public static void main() {
		Square sq1 = new Square(2);
		Rectangle r1 = new Rectangle(3, 6);
		
		r1.area();
		System.out.println();
		sq1.area();
	}

}