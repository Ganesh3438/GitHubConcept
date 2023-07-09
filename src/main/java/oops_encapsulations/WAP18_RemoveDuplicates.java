package oops_encapsulations;

import java.util.HashSet;
import java.util.Set;

public class WAP18_RemoveDuplicates {

	public static void main(String[] args) {
		
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
