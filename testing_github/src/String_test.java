


public class String_test {

	public static void main(String[] args) {
		
		String s= "velocity";  //---->Heap --->string pool----->constant pool area
		//----------->duplicate are not allowed

		String s1="velocity";  //---->duplicate are allowed
		String s20="newton";
		String s4="   ";
		
		String s2= new String("velocity");  //----heap----->string pool-->non constant pool area
		String s3= new String("velocity");  //----heap----->string pool-->non constant pool area
		String s5=new String ("VELOCITY");  //----
		String s6=new String ("velocity corporate center");
		String s7=new String (" pune");
		
		
		
		
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s20));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s20.contains("ton"));      //other wise "wto" put o/p false
		System.out.println(s4.isEmpty());
		System.out.println(s3.charAt(5));   //char of i..t..y
		System.out.println(s.equals(s2));   //true  using new keyword                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		System.out.println(s==s2);  //false without new keyword
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s20.contains("ton"));         //char---newton
		System.out.println(s4.isEmpty());        //false because it should have space
		
		System.out.println(s7.indexOf('n'));    //pune indexoff 0,1,2,3,4
	    System.out.println(s6.concat(s7));
	    System.out.println(s7.replace('p','P'));    //small letter replace with capital letter
	    System.out.println(s6.replaceAll(" ", " selenium "));   //double ))
		System.out.println(s6.charAt(4));
		System.out.println(s3.endsWith("city"));
		System.out.println(s20.endsWith("ton"));
    	System.out.println(s6.substring(8));
    	System.out.println(s6.substring(8, 12));
		
		
		
		
		
	}

}
	