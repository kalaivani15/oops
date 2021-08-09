abstract class Bike{
	Bike(){         //constructor
		System.out.println("bike is created");
	}
	abstract  void run();   //abstract method
	void gear() {
		System.out.println("gear is changed");
	}
}
class R15 extends Bike{
	void run() {
		System.out.println("run at 100km");    //non abstract method
	}
	
}
public class TestAbstract2 {

	public static void main(String[] args) {
		Bike b = new R15();
		b.run();
		b.gear();

	}

}
