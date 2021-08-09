//copy the value without constructor
public class Square { 
	int side;
	Square(int a){
		side= a;
	}
	Square(){
	}
	void Area() {
		System.out.println("the area of square is " + (side *side));
	}

	public static void main(String[] args) {
		Square s1 = new Square(4);
		Square s2 = new Square();
		s2.side =s1.side;
		s1.Area();
		s2.Area();
		

	}

}
