import java.util.Scanner;
class Main
{ 
	Node head; // head of list 

	/* Linked list Node*/
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

	Node reverse(Node head, int k) 
	{ 
	Node current = head; 
	Node next = null; 
	Node prev = null; 
		
	int count = 0; 

	/* Reverse first k nodes of linked list */
	while (count < k && current != null) 
	{ 
		next = current.next; 
		current.next = prev; 
		prev = current; 
		current = next; 
		count++; 
	} 

	/* next is now a pointer to (k+1)th node 
		Recursively call for the list starting from current. 
		And make rest of the list as next of first node */
	if (next != null) 
		head.next = reverse(next, k); 

	// prev is now head of input list 
	return prev; 
	}					 

					
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
	    Node newNode = new Node(new_data);
 Node lastNode = head;
 if(head == null)
 {
 head = newNode;
 }
 else
 {
 while(lastNode.next != null)
 {
 lastNode = lastNode.next;
 }
 lastNode.next = newNode;
 } 

	} 

	/* Function to print linked list */
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
		System.out.println(temp.data+" "); 
		temp = temp.next; 
		} 
		//System.out.println(); 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		Main llist = new Main(); 
		
		Scanner sc = new Scanner(System.in);
        int elementToBeInserted = sc.nextInt();
      int len =0;
	while(elementToBeInserted >0){
    	len++;
		llist.push(elementToBeInserted);
   // System.out.println(elementToBeInserted);
    	elementToBeInserted = sc.nextInt(); 
	}
		int n = sc.nextInt();
		llist.head = llist.reverse(llist.head, n); 
		llist.printList(); 
	} 
} 

