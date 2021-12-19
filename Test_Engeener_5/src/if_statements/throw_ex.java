package if_statements;

public class throw_ex {

	  public static void main(String[] args)
	  
	  
	  {  
          throw_ex obj = new throw_ex();  
          obj.checkNum(-3);  
          System.out.println("Rest of the code..");  
        
	  } 
		
		    public static void checkNum(int num) {  
		        if (num < 1) {  
		            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
		        }  
		        else {  
		            System.out.println("Square of " + num + " is " + (num*num));  
		        }  
		    }  
  
		  

	}


