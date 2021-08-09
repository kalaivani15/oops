class Student3{
	int id;
	String name;
}
public class TestStudent {

	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 = new Student();
		//initialize by reference variable
		s1.id = 100;
		s1.name = "sri";
		s2.id = 101;
		s2.name ="kavi";
		System.out.println(s1.id + " " +s1.name);
		System.out.println(s2.id + " " +s2.name);
		
		

	}

}
