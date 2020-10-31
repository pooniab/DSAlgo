package linkedList;
public class ReverseLinkedList {
	static NewNode head;
	static class NewNode {  
		NewNode next;
		int data;
		NewNode(int key){
			data=key;
			next=null;
		}
	}

	
	
	public static void main(String[] args) {
		
		ReverseLinkedList list = new ReverseLinkedList();
		int k=3;
		list.head= new NewNode(1);
		head.next=new NewNode(2);
		head.next.next = new NewNode(3);
		head.next.next.next = new NewNode(4);
		head.next.next.next.next= new NewNode(5);
		head.next.next.next.next.next = new NewNode(6);
		
		//list.display(head);
		//head = list.reverseList(head);
		//list.display(head);
		head = list.reverseListin_K_Set(head,k);
	    list.display(head);

		
	}
// Reverse the linked list in set of given no.
// Example given no. is 3. Reverse first 3 node and then reverse next 3 node and so on.
	private NewNode reverseListin_K_Set(NewNode head, int k) {
		// TODO Auto-generated method stub
		NewNode prev=null;
		NewNode next = null;
		NewNode cur=head;
		int count =0;
		while (cur!=null && count <k) {
			next =cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
			
		}
		if (next!=null) {
			head.next = reverseListin_K_Set(next, k);
		}
		//head2=prev;
		return prev;
}	
	// Reverse the a given linked list
private NewNode reverseList(NewNode head) {	
		NewNode prev=null;
		NewNode next = null;
		NewNode cur=head;
		while (cur!=null) {
			next =cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			
		}
		//head2=prev;
		return prev;
	}

	
	
	
	private static void display(NewNode head2) {
		
		//NewNode cur= head2;		
		while (head2!=null) {
			System.out.println(head2.data);
			head2=head2.next;
		}

		// TODO Auto-generated method stub
		
	}

}
