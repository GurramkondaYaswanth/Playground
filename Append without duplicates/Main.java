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
   int matched =0;
 if(head == null)
 {
 head = newNode;
 }
 else
 {
 while(lastNode.next != null)
 {
   if(lastNode.data == elementToBeInserted){
     matched =1;
   }
 lastNode = lastNode.next;
 }
  if(lastNode.data == elementToBeInserted){
     matched =1;
   }
   if(matched ==0)
     lastNode.next = newNode;	
 	}
 }



public void printList()
{
Node temp = head;
while(temp != null)
{
	System.out.println(temp.data + " ");
	temp = temp.next;
}
}

public static void main(String[] args)
{
Main ll = new Main();
Scanner sc = new Scanner(System.in);
  int len = 0;
  int elementToBeInserted = sc.nextInt();
while(elementToBeInserted >0){
    len++;
	ll.insertElement(elementToBeInserted);
    elementToBeInserted = sc.nextInt(); 
}
if(len <1){
  System.out.println("List is empty");
}else
  ll.printList();

}
    
 }
