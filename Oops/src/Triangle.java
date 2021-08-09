//copy the value from one object to another by constructor
public class Triangle {
	int length;
	int breadth;
	Triangle(int l ,int b){
		length = l;
		breadth = b;
	}
		Triangle (Triangle t){
			length = t.length;
			breadth = t.breadth;
		}
		void AreaofTriangle(){
			System.out.println("the area of traingle is " +((0.5)*length*breadth));
		}
		
		
	public static void main(String[] args) {
		Triangle t1 = new Triangle(12 ,15);
		Triangle t2 = new Triangle(t1);
		t1.AreaofTriangle();
		t2.AreaofTriangle();
		

	}

}
