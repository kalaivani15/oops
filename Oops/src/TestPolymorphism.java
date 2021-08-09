//run time polymorphism
class Flower{
	void fragrance() {
		System.out.println("fragrance");}
	}
class Rose extends Flower{
	void fragrance() {
		System.out.println("rose fragrance");}
	}
class Jasmine extends Rose{

}
public class TestPolymorphism {

	public static void main(String[] args) {
		Flower j = new Jasmine();
		j.fragrance();
	}

}
