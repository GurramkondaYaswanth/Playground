import java.util.Scanner;
class Main { 
    public static void main(String args[]) 
    { 
        Main tree = new Main(); 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int max =0;
      while(n > -1){ 
        if(max<n){
          max = n; 
        }
        n = sc.nextInt();
      }
        // Function call 
        System.out.println("Maximum element is "
                           + max); 
    } 
}