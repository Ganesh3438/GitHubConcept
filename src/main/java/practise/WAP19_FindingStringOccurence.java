package practise;

import java.util.HashMap;
import java.util.Map;

public class WAP19_FindingStringOccurence {

	public static void main(String[] args) {

		String str = "Hello";

//		char[] ch = str.toCharArray();
//		System.out.println(ch);
//		System.out.println("-----------------------------------");

		Map<Character, Integer> map = new HashMap<>();

//		for (Character i : ch) {
//
//			Integer count = map.get(i);
//
//			if (count == null) {
//
//				map.put(i, 1);
//			} else {
//
//				count = count + 1;
//
//				map.put(i, count);
//			}
//		}

//		System.out.println(map);

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			Integer count = map.get(ch);
			if (count == null) {

				map.put(ch, 1);
			} else {

				count = count + 1;

				map.put(ch, count);
//				System.out.print(ch + " " + count);
			}
		}
		
//		System.out.println("");

		System.out.println(map);

	}

}
