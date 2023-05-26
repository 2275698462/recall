public class Homework04{
	public static void main(String[] args) {
           Circle a = new Circle(5);
             PassObject b = new PassObject();
			 b.prinAreas(a, 5);
	}
}
class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return radius * radius * 3.14;
	}
}
class PassObject {
	public void prinAreas(Circle c, int times) {
		for(double i = 1; i <= times; i++) {
			System.out.println(i);
			System.out.println(i * i * 3.14);
		}
	}
}