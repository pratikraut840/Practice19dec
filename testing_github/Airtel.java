package generelization;

public class Airtel implements TRAI_rules {

	public static void main(String[] args) {
		

	}

	@Override
	public void TRAI() {
		System.out.println("TRAI is the main office having rules");
		
	}

	@Override
	public void CALL() {
		System.out.println("Airtel calling rate 1.0ru/min");
		
	}

	@Override
	public void SMS() {
		System.out.println("Airtel 100 sms/day");
		
	}

	@Override
	public void DATA() {
		System.out.println("Airtel 1.5 gb/day");
		
	}

}
