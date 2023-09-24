package arrays;

import java.util.ArrayList;
import java.util.List;

public class TC06_CopyArray {
	
	
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public static ArrayList<Integer> solve(final List<Integer> A, int B) {
            int n = A.size();
	    	
//            Integer c = new Integer(n);
            
            ArrayList<Integer> list = new ArrayList<Integer> ();
	    	for(int i=0; i<A.size(); i++){
	           Integer c = A.get(i) + B;
	    		list.add(c);
	        }
	        
	     return list;
	    }
	    
	    
	    public static void main(String[] args) {
			
			List<Integer> A= new ArrayList<Integer>();
			A.add(1);
			A.add(3);
			A.add(5);
			int b = 2;
			ArrayList<Integer> list = solve(A, b);
			System.out.println(list);

		}

	    

}

	

	


