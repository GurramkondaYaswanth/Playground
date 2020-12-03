import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    //System.out.println("Hello World!");
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
    int k,l; 
 
    k = 0; 
    System.out.print(k+" "); 
       
    // Consider rest of the activities 
    for (l = 1; l < n; l++) 
    { 
         // If this activity has start time greater than or 
         // equal to the finish time of previously selected 
         // activity, then select it 
         if (a[l] >= b[k]) 
         { 
              System.out.print(l+" "); 
              k = l; 
          } 
     } 

  }
}