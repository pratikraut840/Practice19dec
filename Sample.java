package String_Study;

public class Sample {

	public static void main(String[] args) {
		
		String s="Velocity "; // Heap area --> without using new keyword -->constant pool area -->duplicates are not allowed
		
		
		String s1="VelocitYY";
		
		String s14="Training";
		
		String s4=new String("Velocity");
		
		String s5=new String("Mansoon");
		
		String s6=new String("");
		
		String s7=new String (" punp");
		
		System.out.println(s.concat(s14));
		
//		System.out.println(s1);
//		System.out.println(s);
//		System.out.println("--------------");
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		System.out.println(s.contains(s4));
//		System.out.println(s.equals(s5));
//		System.out.println(s4.toUpperCase());
//		System.out.println(s.equalsIgnoreCase(s5));
//		System.out.println(s6);
//		System.out.println(s14.length());
//		System.out.println(s5.toLowerCase());
//		System.out.println(s5.toUpperCase());
//		System.out.println(s1.startsWith("Ve"));
//		System.out.println(s7.replace('n','m'));
//		System.out.println(s5.replaceAll("Mansoon", "Commingsoon"));
//  	System.out.println(s5.indexOf('o'));
//		System.out.println(s7.lastIndexOf('p'));
//		System.out.println(s4.concat(" "+s5));
//  	System.out.println(s4.concat(" corporate"));
		
//		System.out.println(s.indexOf('t'));
		
//		
//		
//		
		
		
	}

}
