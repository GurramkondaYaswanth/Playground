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
    for(int i =0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    int value = binary(arr,0,n-1,x);
    if(value >0){
      System.out.println(value);
    }else{
      System.out.println("Not found");
    }
  }
  
  static int binary(int arr[],int l,int r,int x){
    if(r >= l){
      int mid = (l+r)/2;
      //System.out.println(mid);
      //System.out.println(arr[mid]);
      //System.out.println(x);
      if(arr[mid] == x){ 
        //System.out.println(mid);
        return mid;  
      }else if(arr[mid] <x){
        return binary(arr,mid+1,r,x);
      }else if(arr[mid] >x){
        return binary(arr,l,mid-1,x);
      }
    }
    return -1;
  }
}
