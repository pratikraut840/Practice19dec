package Git_Study;

public class implecitandexplicit {

	public static void main(String[] args) {
		
         implecitandexplicit IE = new implecitandexplicit();
         IE.test();
	}
	public void test()
	{
		int a=10;// original value
		System.out.println(a);
		
		// widening--> implicit casting
		// lower--> higher, no data loss, memory increases
		double b=a;// casted value
		
		System.out.println(b);
		
		
		
		double c=10.5;
		System.out.println(c);
		// narrowing--> explicit casting
		// higher--> lower, data loss takes place, memory decreases
		int d= (int)c;
		System.out.println(d);
		
		
		float e=199.90f;
		
		int f=(int)e;
		System.out.println(f);
		System.out.println(e);
		
		//10,11,12,13,
		//10,10.1,10.2.....--> 
		//10,11,12,------> explicit casting
		
		// 1490.77-->1491
		//
		
		
	}

}
