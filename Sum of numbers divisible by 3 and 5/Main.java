import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World!");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int sum = SumNumbersDivisible(m,n);
    System.out.println(sum);
  }
  private static int SumNumbersDivisible(int m, int n)
  {
    int sum =0;
    for(int i = m; i<n; i++){
      if(i %15 ==0){
        sum = sum+i;
      }
    }
    return sum;
  }
}