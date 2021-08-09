interface Bank1{
	float RateOfInterest();
}
class SBI implements Bank1{
	public float RateOfInterest() {
		return 7.0f;}
	}
class IOB implements Bank1{
	public float RateOfInterest() {
		return 8.0f;}
	}
	

public class Interface {

	public static void main(String[] args) {
		Bank1 b = new SBI();
		System.out.println("rate of interest " +b.RateOfInterest());

	}

}
