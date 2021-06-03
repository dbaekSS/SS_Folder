package day2;

public class Circle implements Shape {
	int radius;
	final double pi = Math.PI;
	
	public Circle(int r) {
	radius = r;	
	}

	@Override
	public int calculateArea() {
		return (int) (radius * radius * pi);
	}

	@Override
	public void display() {
		System.out.println(calculateArea());
		
	}

}
