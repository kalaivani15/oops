//runtime polymorphism
class Shape{
	void draw() {
		System.out.println("drawing shape");}
}
class Rectangle1 extends Shape{
	void draw() {
		System.out.println("drawing rectangle");}
	}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle1();
		s.draw();
		s= new Circle();
		s.draw();
	}
}



