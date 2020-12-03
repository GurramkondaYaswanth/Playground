import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    //System.out.println("Hello World!");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    int n;
    int key = 0;
    for(int i=0; i<4; i++){
        int a = n1%10;
        n1 = n1/10;
        int b = n2%10;
        n2 = n2/10;
        int c = n3%10;
        n3 = n3/10;
      if(i%2 == 0){   //large
        if(a >b && a>c){
          n=a;
        }else if(b >a && b>c){
          n=b;
        }else{
          n=c;
        }
      }else{
        if(a<b && a<c){
          n=a;
        }else if(b<a && b<c){
          n=b;
        }else{
          n=c;
        }
      }
     if(i>0){
      int value = (int)(Math.pow(10,i));
      key = n*(value)+key;
     }else{
       key = n;
     }
  }
    System.out.println(key);
  }
}