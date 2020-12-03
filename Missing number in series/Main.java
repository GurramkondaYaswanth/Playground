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
    
    int d = (arr[n-1]-arr[0])/n;
    System.out.println(MissingNumber(arr,d,0,n-1));
  }
  
  static int MissingNumber(int arr[],int d,int l,int r){
    int mid = (l+r)/2;
    int midValue = (arr[0]+(mid)*d); 
    if(l<r){
      if(arr[mid] == midValue){
        return MissingNumber(arr,d,mid+1,r);
      }else{
        return MissingNumber(arr,d,l,mid-1);
      }
    }else{
      if(arr[mid] != midValue){
	    return (arr[0]+(mid)*d);
	  }else
	 	return (arr[0]+(mid+1)*d);
    }
  }
}
