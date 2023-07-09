package practise;

import java.util.HashSet;
import java.util.Set;

public class WAP18_RemovingALLDuplicatesInString {;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Java";
		
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(!set.contains(ch)) {
				set.add(ch);
				sf.append(ch);
			}
		}

		System.out.print(sf);
	} 

}
