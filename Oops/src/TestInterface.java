//multiple inheritance
interface Printable{
	void print();
}
interface  Showable{
	void show();
	}

public class TestInterface implements Printable,Showable {
	public void print() {
		System.out.println("hello");}
	public void show() {
		System.out.println("everyone");}
	

	public static void main(String[] args) {
		TestInterface t = new TestInterface();
		t.print();
		t.show();
		
	
	}

}
