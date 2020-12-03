import java.util.*;
class Main { 

    class Node  
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    static Node root; 
  
    // This method mainly calls insertRec() 
    void insert(int key)  
    {  
         root = insertRec(root, key);  
    } 
  
    /* A recursive function to  
       insert a new key in BST */
    Node insertRec(Node root, int key) 
    { 
  
        /* If the tree is empty, 
           return a new node */
        if (root == null)  
        { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
   static int sum; 
      
   
  
    // Driver Code 
    public static void main(String[] args) 
    { 
      Main tree = new Main(); 
  		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n > -1){
        tree.insert(n); 
        sum = sum +n;
        n = sc.nextInt();
      }
     
       
        System.out.println("Sum of all nodes are "+sum); 

    } 
}
