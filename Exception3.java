package Exception;

public class Exception3 {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		String s="Velocity";
		
		arr[4]=1111;
		System.out.println(arr[4]);
		
		
		try {
			System.out.println(s.length());
			arr[4]=111;
			arr[7]=222;
			System.out.println(arr[4]);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check array size");
		}
		catch (NullPointerException e) {
			System.out.println("Check string");
			
		}
		finally {
			System.out.println("Finally block will be always there");
			
		}
		
	}

}
