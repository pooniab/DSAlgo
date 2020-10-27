package linkedList;

import java.util.HashMap;
import java.util.HashSet;

public class InterSectionPointofLinkedList {

	
	public static class Node{
    
		int data;
		Node next;
		Node(int key){
			data = key;
			next = null;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node(10);
		n1.next=new Node(20);
		n1.next.next = new Node(30);
		n1.next.next.next = new Node(40);
		n1.next.next.next.next = new Node(50);
		
		Node n2 = new Node(12);
		n2.next=new Node(24);
		n2.next.next = new Node(40);
		n2.next.next.next = n1.next.next.next;
	
		print (n1);
		print (n2);
		System.out.println("Intersected node" + intersectionNode(n1,n2).data);
		
	}
	private static Node intersectionNode(Node n1, Node n2) {
		
		HashSet<Node> h = new HashSet<Node>();
		
		while (n1!=null) {
			h.add(n1);
			n1=n1.next;
		}
		
		while (n2!=null) {
		
			if (h.contains(n2)) {
				return n2;
				
			}
			n2=n2.next;
		}
		return null;
		
	
		 
	}
	private static void print(Node n1) {
		// TODO Auto-generated method stub
		
		Node current=n1;
		while (current !=null) {
			System.out.println(current.data);
			current=current.next;
		}
		//System.out.println(current.data);
		
	}

}
