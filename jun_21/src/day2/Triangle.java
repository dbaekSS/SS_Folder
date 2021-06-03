package day2;

public class Triangle implements Shape {
	int base, height;
	public Triangle(int b, int h) {
		base = b;
		height = h;
	}
	
	@Override
	public int calculateArea() {
		return ((base*height)/2);
	}

	@Override
	public void display() {
		System.out.println(calculateArea());
	}
}
