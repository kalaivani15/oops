//this keyword
public class Employee {
	int emp_id;
	String name ;
	float salary;
	Employee(int emp_id,String name){
		this.emp_id=emp_id;
		this.name = name;	
	}
	Employee(int emp_id,String name,float salary){
		this(emp_id,name);    //reuse constructor 
		this.salary =salary;
	}
	void Display() {
		System.out.println(emp_id + " " +name +" " +salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111,"vj");
		Employee e2 = new Employee(222,"sri",20000);
		e1.Display();
		e2.Display();
	

	}

}
