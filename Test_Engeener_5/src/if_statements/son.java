package if_statements;

public class son extends mother {

	public void bike()
	{
		System.out.println("SONS BIKE");
	}
	public void LAPTOP()
	{
		System.out.println("SONS LAPTOP");
	}	

	public static void main(String[] args)
	{
		son s=new son();
		s.bike();
		s.LAPTOP();
		s.cook();
		s.look();
		s.key();
		s.money();
		
	}

}
