import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack; 
import java.util.Scanner;
// Java program to reverse a queue 
public class Main { 
      
    static Queue<Integer> queue; 
  
    // Utility function to print the queue 
    static void Print() 
    { 
        while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + " "); 
            queue.remove(); 
        } 
    } 
  
    // Function to reverse the queue 
    static void reversequeue() 
    { 
        Stack<Integer> stack = new Stack<>(); 
        while (!queue.isEmpty()) { 
            stack.add(queue.peek()); 
            queue.remove(); 
        } 
        while (!stack.isEmpty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        queue = new LinkedList<Integer>(); 
        Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      if(num<0){
        System.out.println( "Queue is empty");
      }else{
      System.out.println("Before reversing:");
      int n =0;
      while(num>0){
        System.out.print(num+" ");
        queue.add(num);
        n++;
        num = sc.nextInt();
      }
        reversequeue(); 
      System.out.println();
       System.out.println("After reversing:");
        Print(); 
      }
    } 
} 