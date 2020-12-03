import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World!");
    int n = sc.nextInt();
    int max =0;
    int sum = 0;
    int[] amount = new int[n];
    for(int i=0; i<n;i++){
      amount[i] = sc.nextInt(); 
    }
    
    if(n == 0){
      max =0;
    }else if(n ==1){
      max = amount[0];
    }else if(n ==2){
      if(amount[0] > amount[1]){
        max = amount[0];
      }else{
        max = amount[1];
      }
    }else{
         int first = 0, second = 0;
      for(int j =0; j<n;j++) {
            int curr = Math.max(amount[j]+first, second);
            first = second;
            second = curr;
        }
        max = Math.max(first, second);
    }
    System.out.println(max);
  }
}
