    //overloading
public class Student6 {
	int id;
	String name;
	float mark;
	 Student6(int i,String n){    //constructor
	 id = i;
	 name = n;
	}
	 Student6(int i,String n, float m ){
		 id = i;
		 name = n;
		 mark = 90;
	 }
	 void Display() {
		 System.out.println(id + " " + name + " " +mark);
	 }

	public static void main(String[] args) {
		Student6 s1 = new Student6(1,"sam");
		Student6 s2 = new Student6(2,"ram",98);
		s1.Display();
		s2.Display();
	
		

	}

}
