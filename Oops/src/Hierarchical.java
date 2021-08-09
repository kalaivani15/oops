class Cars{
	void wheel() {
		System.out.println("wheel");
	}
}

	class Toyato extends Cars{
		void color() {
			System.out.println("colors");
		}
	}
		class Suzuki extends Cars{
			void tool() {
				System.out.println("tool");
			}
		}
	
	

public class Hierarchical {

	public static void main(String[] args) {
		Suzuki s = new Suzuki();
		
		s.tool();
		s.wheel();   
		// s.colors(); got error
	
	}
}
		

	


