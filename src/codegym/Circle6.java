package codegym;

public class Circle6 {
	
	public double x;
	public double y;
	public double radius;
	
	public Circle6(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle6(double x, double y) {
		this(x, y, 10);
		
		
	}
	
	public Circle6() {
		this(5, 5, 1);
	}
	
		

	public static void main(String[] args) {
		Circle6 circle = new Circle6();
		System.out.println(circle.x + " " + circle.y + " " + circle.radius);
		Circle6 circle2 = new Circle6();
		System.out.println(circle2.x + " " + circle2.y + " " + circle.radius);

	}
	
}
