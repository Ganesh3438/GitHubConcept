package arrays;

import java.util.ArrayList;

public class TC13_FirstAndLastUsingArrayList {
	
	
	    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

	      int n = A.size();
	      int fi= -1;
	      int li = -1;
	      
	      ArrayList<Integer>list = new ArrayList<Integer>();

	     for(int i=0; i<n; i++){
	         if(A.get(i)==B){
	             fi = i;
	         }
	     }
	    
	      for(int i=A.size()-1; i>=0; i--){
	         if(A.get(i)==B){
	             li = i;
	         }
	     }

	     list.add(fi);
	     list.add(li);

	     

	     return list;

	    }
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(7);
		
		int b = 3;
		ArrayList<Integer> list1 = solve(list, b);
//		 list1.sort(Comparator.naturalOrder());
		System.out.println(list1);
		
	}

}
