package day26_String1;

public class WAP01_StringMethods {

	public static void main(String[] args) {
		
		// What is String?
		// String is sequence of characters
		
		String s = "Hello World";
		
		// How to find the length of string 
		   System.out.println(s.length());
		   
	   // Find a char present at a particular index
		   System.out.println(s.charAt(7)); // o
		   
	   // Imp Note: We can't go to index and change the char present at that index.
		   
       // Concatenation of Strings with numbers
		  String a = 12 + 5 + "Hello" + 12 + 5;
		  System.out.println(a); // 17Hello125
		   
	  // Concatenation of strings with char
		 String  str = "Hell" + 'o';
		 System.out.println(str);
		 
		 String s1 = "Hell" + 'o' + " World";
		 System.out.println(s1);

	}

}
