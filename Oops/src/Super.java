class Person{
	int id;
	String name;
	 Person(int id,String name) {
		this.id = id;
		this.name = name;}
	}
	class Emp extends Person{
		float salary;
	 Emp(int id,String name,float salary) {
			super(id,name);     //reuse constructor
			this.salary = salary;}
	 void Display() {
		 System.out.println(id + " " + name + " " + salary);
		}
	}

public class Super {

	public static void main(String[] args) {
		Emp e = new Emp(100,"vani",10000);
		e.Display();
		

	}

}
