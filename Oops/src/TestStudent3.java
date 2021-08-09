//example for static variable
public class TestStudent3 {
	int id;
	String name;
	static String college ="KIT";
	TestStudent3(int i,String n){
		id = i;
		name = n;
	}
	void Display() {
		System.out.println(id + " " + name + " " + college) ;
	}

	public static void main(String[] args) {
		TestStudent3 s1 = new TestStudent3(100,"kalai");
		TestStudent3 s2 = new TestStudent3(101, "viji");
		s1.Display();
		s2.Display();

	}

}
