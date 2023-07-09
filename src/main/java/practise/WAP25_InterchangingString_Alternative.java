package practise;

public class WAP25_InterchangingString_Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Automation";  // op: uAotamitno
		String temp = "";
		String temp1 = "";
		
		for (int i = 0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if (i % 2 == 0) {
				temp = temp + ch;
			}
		}
		
		for (int i = 0; i<name.length(); i++) {
			char ch = name.charAt(i);
			if (i % 2 != 0) {
				temp1 = temp1 + ch;
			}
		}


		
		for(int i=0; i<temp1.length(); i++) {
			char ch = temp1.charAt(i);

			
			for(int j=0; j<temp.length(); j++) {
				if(i==j) {
					char ch1 = temp.charAt(i);
                    char ch2;
					ch2 = ch1;  // ch2 = A
					ch1 = ch;   // ch1 = u
					
					System.out.print(ch1+""+ch2);
					
				}
					
			}
			
			
		}
		
	
				

	}

}
