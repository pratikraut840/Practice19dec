package String_Study;

public class Palindrome_reverse_string {

	public static void main(String[] args) 
	{
		String A="NAYAN";
		String B="";
		
		for(int i=A.length()-1; i>=0; i--) // Total characters in A=5, 
			//but lenght is 6 bcoz index starts from 0, thatswhy we wrote length()-1
		{
			B=B+A.charAt(i);
		}
		
		System.out.println("Given String is "+A);
		System.out.println("Given String is "+B);
		
		if (A.equals(B)) {
			System.out.println("Given String is Palindrome");
			
		} else {
			
			System.out.println("Given String is not Palindrome");

		}
		
	}

}
