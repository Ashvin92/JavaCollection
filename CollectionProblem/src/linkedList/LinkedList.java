package linkedList;

public class LinkedList {
	
	Node head;
	
	static class Node 
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next=null;
		}
	}
	
	
	public void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data +" "+"->");
			n=n.next;
		}
		System.out.print("null");
	}
	
	public void addNodeHead(int data)
	{
		
		Node n = new Node(data);
		n.next = head;
		head=n;
	}
	
	public void addNodeLast(int data)
	{
		Node n = new Node(data);
		Node node;
		node = head;
		while(node.next!=null)
		{
			node=node.next;
			System.out.println(node.data);
		}
		node.next = n;
		
	}
	
	
	public int countNumberofNode()
	{
		int count = 0;
		if(head==null)
		{
			return count;
		}
		Node n = head;
		while(n!=null)
		{
			count++;
			n = n.next;
			
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.head = new Node(1);
		Node node = new Node(2);
		Node node2 = new Node(3);
		
		linkedList.head.next = node;
		node.next = node2;
		
		linkedList.addNodeHead(5);
		linkedList.addNodeHead(4);
		
		linkedList.addNodeLast(10);
		
		linkedList.printList();
		
		System.out.println("fhgghh"+linkedList.countNumberofNode());
	   
		
	}

}
