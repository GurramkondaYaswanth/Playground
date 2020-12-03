import java.util.*; 
import java.io.*; 

class Main
{ 
	// Returns maximum number of thieves 
	// that can be caught. 
	static int policeThief(String arr[], int n, int k) 
	{ 
		int res = 0; 
		ArrayList<Integer> thi = new ArrayList<Integer>(); 
		ArrayList<Integer> pol = new ArrayList<Integer>(); 

		// store indices in the ArrayList 
		for (int i = 0; i < n; i++) { 
			if (arr[i].equals("P")) 
			pol.add(i); 
			else  
			thi.add(i); 
		} 

		// track lowest current indices of 
		// thief: thi[l], police: pol[r] 
		int l = 0, r = 0; 
		while (l < thi.size() && r < pol.size()) { 

			// can be caught 
			if (Math.abs(thi.get(l) - pol.get(r)) <= k) { 
			res++; 
			l++; 
			r++; 
			} 
			
			// increment the minimum index 
			else if (thi.get(l) < pol.get(r)) 
				l++; 
			else
				r++; 
		} 
		return res; 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
      	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      String arr1[] =new String[n];
      for(int i =0; i<n;i++){
        arr1[i] = sc.next();
      } 
		int k = sc.nextInt(); 
	
		System.out.println("Maximum thieves caught: "
							+policeThief(arr1, n, k)); 
							
		
	} 
} 


