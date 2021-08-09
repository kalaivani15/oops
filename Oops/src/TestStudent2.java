class Student4{
	int id;
	String name;
	   // initialize by method
	public void insertRecord(int i,String n) {
		id =i;
		name = n;	
	}
	public void Display() {
		System.out.println(id + " " +name);
	}
}
public class TestStudent2 {

	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
       s1.insertRecord(101, "kavin");
       s2.insertRecord(102, "navin");
       s1.Display();
       s2.Display();
  	
		

	}

}
