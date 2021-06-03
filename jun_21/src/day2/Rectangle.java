package day2;

public class Rectangle implements Shape {
	int side1, side2;
	public Rectangle(int s1, int s2) {
		side1 = s1;
		side2 = s2;
	}
	
	@Override
	public int calculateArea() {
		return side1 * side2;
	}

	@Override
	public void display() {
		System.out.println(calculateArea());
	}

}
