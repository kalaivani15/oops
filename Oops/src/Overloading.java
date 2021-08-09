
public class Overloading {
	void add(long a,int b) {   //overloading with type promotion
		System.out.println(a+b);	
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.add(10,15);
		obj.add(10,15,1);

	}

}
