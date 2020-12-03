import java.util.Scanner;
 class Main
{
	Node head;
	class Node
	{
	int data;
	Node next;

	Node(int element)
	{
	data = element;
	next = null;
	}
	}

 public void insertElement(int elementToBeInserted)
 {
 Node newNode = new Node(elementToBeInserted);
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

  //public void DelSecondLast(){
  //  Node lastNode = head;
	// while(lastNode.next != null)
 	//{
 	//lastNode = lastNode.next;
 	//}
	//lastNode.next = newNode;
  //}

public void printList(int n)
{
  int secondlast = 2;
Node temp = head;
while(temp != null)
{
  if(n != secondlast){
	System.out.print(temp.data + " ");
	temp = temp.next;
  }else{
    temp = temp.next;
  }
  n--;
}
}

public static void main(String[] args)
{
Main ll = new Main();
Scanner sc = new Scanner(System.in);
//int size = sc.nextInt(); // size = 3
//for(int i = 0; i < size; i++) // i = 0, 1, 2
  int len = 0;
  int elementToBeInserted = sc.nextInt();
while(elementToBeInserted >0){
    len++;
	ll.insertElement(elementToBeInserted);
    elementToBeInserted = sc.nextInt(); 
}
//System.out.println("Elements present in the linked list");
  if(len>1){
ll.printList(len);
  }else{
    System.out.println("Deletion of second last element is not possible");
  }
}
    
 }
