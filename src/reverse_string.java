

public class reverse_string {

	public static void main(String[] args)
	{
//		String original = "anant";
//		String reverse ="";
//		
//		for(int i=original.length()-1; i>=0;i--)
//		{
//			reverse= reverse +original.charAt(i);
//		}
//		System.out.println("original string is "+original);
//		System.out.println("reverse string is "+ reverse );
//		
		
		String a= "MOM";
		String b="";
		for ( int i=a.length()-1;i>=0;i--)
		{
			b= b+a.charAt(i);
		}
//		System.out.println(b);
		
		System.out.println("original string is "+ a);
		System.out.println("reverse string is "+b);
		
		if (a.equals(b))
		{
			System.out.println("it is a palandrion ");
			
		}                                                            // palinndrom 
		else 
		{
			System.out.println("it is not a palandriom ");
		}
		
		

	}

}
