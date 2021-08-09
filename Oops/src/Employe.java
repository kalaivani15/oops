
public class Employe {
	int id;
	String name;
	float salary;
	Address address;
	public Employe(int id,String name,float salary,Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	void Display() {
	System.out.println(id + " " + name +" " +salary );
	System.out.println(address.city + " " +address.state + " " + address.country);
	}
	

	public static void main(String[] args) {
		Address address1 = new Address("srivi","TN","India");
		Address address2 = new Address("RJPM","TN","India");
		
		
		
		Employe e2= new Employe(100,"raji",25000,address1);
		Employe e1= new Employe(101,"viji",20000,address2);
		e1.Display();
		e2.Display();
	}

}
