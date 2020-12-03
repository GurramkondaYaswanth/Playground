import java.io.*; 
import java.util.*;
  
class Main  
{ 
    public static void main (String[] args)  
    { 
        int coins[] = {1000,500,100,50,20,10,5,2,1}; 
        int m = 9; 
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); 
      	for(int i=0;i<9;i++){
          while( v>=coins[i]){
            v = v-coins[i];
            System.out.print(coins[i]+"  ");
          } 
        }
        //System.out.println (); 
    } 
} 
