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
      
    // utility function which calculates 
    // sum of all leaf nodes 
    static void leafSum(Node root){ 
        if (root == null) 
            return; 
       
        // add root data to sum if  
        // root is a leaf node 
        if (root.left == null && root.right == null) 
            sum += root.key; 
       
        // propagate recursively in left 
        // and right subtree 
        leafSum(root.left); 
        leafSum(root.right); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
      Main tree = new Main(); 
  		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n > -1){
        tree.insert(n); 
        n = sc.nextInt();
      }
        sum = 0; 
        leafSum(root); 
        System.out.println("Sum of all leaf nodes are "+sum); 

    } 
} 