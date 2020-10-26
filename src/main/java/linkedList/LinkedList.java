package linkedList;

import ch.qos.logback.core.net.SyslogOutputStream;

public class LinkedList {

	node head;
public void InsertNode(int data)
{
	node n1 = new node ();
	n1.data = data;

	if (head == null) {
		head = n1;
	}
	else
	{
	 node n2 = head;
	 while (n2.next != null) {
		 n2= n2.next;
	 }
	 n2.next=n1;
	}
	
	System.out.print("Node Added");
}
public void InsertAt(int data, int index){
	
	node n3 = new node();
	n3.data=data;
	
	node n = head;
	for (int i=0;i<index;i++) {
		n = n.next;
	}
	n3.next=n.next;
	n.next=n3;
	

}

	
public void display () {
	node n2 = head;
	System.out.println("inside in display");
	 while (n2.next != null) {
		 System.out.println("the data in node is :" + n2.data);
		 n2= n2.next;
	 }
	 System.out.println(n2.data);

	 
}

public void insertAtBegining (int data)
{
	node n3 = new node();
	n3.data=data;
	n3.next=head;
	head=n3;
	
	
			
	
}


}

