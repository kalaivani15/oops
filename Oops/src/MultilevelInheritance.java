class Car{
	void wheel() {
		System.out.println("wheel");
	}
}

	class Benz extends Car{
		void color() {
			System.out.println("colors");
		}
	}
		class Bmw extends Benz{
			void tool() {
				System.out.println("tool");
			}
		}
	
	
public class MultilevelInheritance {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.color();
		b.tool();
		b.wheel();
	

	
	}
}
	
		

	


