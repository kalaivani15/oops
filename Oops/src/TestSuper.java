class Cat{
	void drink() {
		System.out.println("drinking");}
	}
	class Kitten extends Cat{
		void sound() {
			System.out.println("meow");}
		
		void drink() {
			System.out.println("drinking milk");}
		
		void behaviour() {
			sound();
			super.drink();    //super keyword used to invoke parent class method
		}
	}
		
		
	

public class TestSuper {

	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.behaviour();

	}

}

