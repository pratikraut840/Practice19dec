package if_statements;

public class Else_If {

	public static void main(String[] args) 
	{
	
		System.out.println("----------RESULT----------");
		Else_If e1=new Else_If();
		e1.Manoj();
		e1.Nilesh();
		e1.Sachin();
	}

	public void Manoj ()
	{
	int marks =40;
	if(marks>=35)
	{System.out.println("Manoj is pass..........");	}
	else{System.out.println("Manoj is fail.....");}	}
		
	public void Nilesh ()
	{
	int marks =67;
	if(marks>=35)
	{System.out.println("Nilesh is pass with Distingsion..........");	}
	else{System.out.println("Nilesh is fail.....");}	}
		
	public void Sachin () 
	{
		int marks =65;
		if(marks>=35)
		{System.out.println("Sachin is pass..........");	}
		else{System.out.println("Sachin is fail.....");}	

	}
	
}
