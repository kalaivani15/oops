//HAS-A relationship
public class Std {
	String name;
	int rollno;
	Details details;
	public Std(int rollno,String name,Details details) {
		this.name = name;
		this.rollno = rollno;
		this.details= details;
	}
	void Display() {
		System.out.println(rollno + " " + name);
		System.out.println(details.dept + " " + details.sec + " " + details.year);
	}

	public static void main(String[] args) {
		Details details1 = new Details("ECE",'A',"thirdyear");
		Details details2 = new Details("EEE",'c',"fourthyear");
		
		Std s1= new Std(14,"priya",details1);
		Std s2= new Std(15,"hema",details2);
		s1.Display();
		s2.Display();
		
		
		

	}

}
