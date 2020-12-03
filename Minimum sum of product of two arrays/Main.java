import java.math.*;
import java.util.Scanner;
  
class Main { 
  
// Function to find the minimum product 
static int minproduct(int a[], int b[], int n,  
                                       int k) 
{ 
    int diff = 0, res = 0; 
    int temp = 0; 
    for (int i = 0; i < n; i++) { 
  
        // Find product of current elements  
        // and update result. 
        int pro = a[i] * b[i]; 
        res = res + pro; 
  
        // If both product and b[i] are  
        // negative, we must increase value  
        // of a[i] to minimize result. 
        if (pro < 0 && b[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
  
        // If both product and a[i] are  
        // negative, we must decrease value  
        // of a[i] to minimize result. 
        else if (pro < 0 && a[i] < 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Similar to above two cases  
        // for positive product. 
        else if (pro > 0 && a[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
        else if (pro > 0 && a[i] > 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Check if current difference  
        // becomes higher than the maximum  
        // difference so far. 
        int d = Math.abs(pro - temp); 
        if (d > diff) 
            diff = d;      
    } 
  
    return res - diff; 
} 
  
// Driver function 
public static void main(String[] args) 
{ 
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  	int[] a = new int[n];
  	int[] b = new int[n];
	for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
  	for(int j=0;j<n;j++){
      b[j] = sc.nextInt();
    }
    
    int k = sc.nextInt(); 
    System.out.println(minproduct(a, b, n, k)); 
} 
} 