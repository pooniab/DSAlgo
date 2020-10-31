package linkedList;

public class AddTwoLinkedList {
	
public static class Node {
	int data;
	Node next;
	
	Node (int key){
		data =key;
		next=null;
	}
}

public static void main(String[] args) {
	
	Node n1 = new Node(1);
	n1.next= new Node(2);
	Node n2 = new Node(3);
	n2.next = new Node(4);
	
	print (n1);
	print (n2);
    
	 print(add(n1,n2));
	
}

private static Node add(Node first, Node second) {

	 Node current=null;
	 Node prev=null;
	 Node result=null;
	 int carry=0, sum=0;
	 while (first!=null || second!=null )
	 {
		 sum = carry+(first!=null?first.data:0)+(second!=null?second.data:0);
	 carry=(sum>=10?1:0);
	 sum=sum%10;
	 
	 current = new Node(sum);
	 if (result==null) {
		 result=current;
	 }
	 else
		 prev.next=current;
	 
	 prev=current;
	 
	 if (first!=null) {
		 first=first.next;
	 }
	 if (second!=null) {
		 second=second.next;
	 }
	}
	
	 if (carry >0);
	 {
		 current.next=new Node (carry);
	 }
	 
return result;
}

private static void print(Node n1) {
	
	Node current = n1;
	 
	
	while (current!=null) {
		System.out.println(current.data);
		current = current.next;
	}
	// TODO Auto-generated method stub
	
}

}
