//example for static method
public class TestStudent4 {
	int id;
	String name;
	static String college ="KIT";
	//static method
	static void change() {
	     college = "SRM";
	}
	TestStudent4(int i,String n){
		id = i;
		name = n;
	}
	void Display() {
		System.out.println(id + " " + name + " " + college) ;
	}

	public static void main(String[] args) {
		TestStudent4.change();
		TestStudent4 s1 = new TestStudent4(100,"kalai");
		TestStudent4 s2 = new TestStudent4(101, "viji");
		s1.Display();
		s2.Display();
		
   
	}
}
	



	
	


