import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World!");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    minimumSwaps(arr, n);
  }
   public static void minimumSwaps(int a[], int n) 
    { 
        int maxx = -1, minn = a[0], l = 0, r = 0; 
        for (int i = 0; i < n; i++) { 
  
            // Index of leftmost largest element 
            if (a[i] > maxx) { 
                maxx = a[i]; 
                l = i; 
            } 
  
            // Index of rightmost smallest element 
            if (a[i] <= minn) { 
                minn = a[i]; 
                r = i; 
            } 
        } 
        if (r < l) 
            System.out.println(l + (n - r - 2)); 
        else
            System.out.println(l + (n - r - 1)); 
    }
}