import java.io.*;
import java.util.*;
 
// A BST node
class Node {
    int data;
    Node left, right;
    int lCount;
    Node(int x)
    {
        data = x;
        left = right = null;
        lCount = 0;
    }
}
 
 
class Main
{
    // Recursive function to insert an key into BST
    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new Node(x);
     
        // If a node is inserted in left subtree, then
        // lCount of this node is increased. For simplicity,
        // we are assuming that all keys (tried to be
        // inserted) are distinct. 
        if (x < root.data) {
            root.left = insert(root.left, x);
            root.lCount++;
        }
     
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
     
    // Function to find k'th largest element in BST
    // Here count denotes the number of 
    // nodes processed so far
    public static Node kthSmallest(Node root, int k)
    {
        // base case
        if (root == null)
            return null;
     
        int count = root.lCount + 1;
        if (count == k)
            return root;
     
        if (count > k)
            return kthSmallest(root.left, k);
     
        // else search in right subtree
        return kthSmallest(root.right, k - count);
    }
     
    // main function
    public static void main(String args[])
    {
        Node root = null;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(n > -1){
        root = insert(root, n); 
        n = sc.nextInt();
      }

     
        int k = sc.nextInt();
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                           + "than k nodes in the BST");
        else{
          
          System.out.println("Enter the kth value:");
            System.out.println("Smallest kth value " + res.data);
        }
    }
}