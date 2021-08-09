class Bank{
	int getInterestOf() {
		return 0;}
}
	
	class HDFC extends Bank{
		@Override
		int getInterestOf() {
			return 7;}
	}
	
	
		class ICICI extends Bank{
			@Override
			int getInterestOf() {
				return 8; }
		}


class Overriding {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		System.out.println(h.getInterestOf());
		System.out.println(i.getInterestOf());
	}
}



		
	




