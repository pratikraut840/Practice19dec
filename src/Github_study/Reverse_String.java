package Github_study;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String orignal = "Kiran";
		String reverse = "";
		for(int i=orignal.length()-1;i>=0;i--)
		{
			reverse = reverse+orignal.charAt(i);
		}
		System.out.println("orignal String is "+orignal);
		System.out.println("reverse String is "+reverse);
		
		
		
		

	}

}
