
public class Rectangle {
	int length;
	int breadth;
	public void InsertRrecord(int l,int b) {
		length = l;
		breadth = b;
	}
	public void AreaOfCalculation() {
		System.out.println("the area of rectangle is " +length * breadth);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.InsertRrecord(15, 12);
		r2.InsertRrecord(13, 9);
		r1.AreaOfCalculation();
		r2.AreaOfCalculation();
		

	}

}
