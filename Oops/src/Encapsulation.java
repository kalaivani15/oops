
public class Encapsulation {

	public static void main(String[] args) {
		AccDetails a = new AccDetails();
		a.setAcc_no(6543);
		a.setEmail("kalai@gmail.com");
		a.setAmount(20000);
		a.setName("kalai");
		System.out.println(a.getAcc_no() +  " " + a.getName() + " " +a.getEmail() + " " + a.getAmount());
		
		

	}

}
