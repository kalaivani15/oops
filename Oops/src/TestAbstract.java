abstract class Shape2{
	abstract void draw();
	}
	class Rectangle2 extends Shape2{
		void draw() {
			System.out.println("draw rectangle");}
	}
		class Circle2 extends Shape2{
			void draw(){
				System.out.println("draw circle");}
				}
			

public class TestAbstract {

	public static void main(String[] args) {
		Shape2 s = new Circle2();
		s.draw();
	}
		

	}


