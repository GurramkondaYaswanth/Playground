import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World!");
    int N = sc.nextInt();
	int D = sc.nextInt();
    System.out.println(specificDiff(N,D));
  }
  static int sum(int N){
    int sum =0;
    while(N>0){
      sum =sum+(N%10);
      N = N/10;
    }
    return sum;
  }
  static int specificDiff(int N,int D){
      int low = 1, high = N;    
        while (low <= high)  
        { 
            int mid = (low + high) / 2; 

            if (mid - sum(mid) < D)         
                low = mid + 1; 
            else       
                high = mid - 1;         
        } 
       
        return (N - high); 
  }
}