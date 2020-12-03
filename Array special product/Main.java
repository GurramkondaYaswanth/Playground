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
    int[] sp = new int[n];
    int prod = 1;
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      prod *= arr[i];
    }
    
    for(int j =0; j<n; j++){
      double ans = 0;
      ans = prod*Math.pow(arr[j],-1);
      sp[j] = (int) ans;
      System.out.println(sp[j]);
    }
  }
}
