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
		list.head= new NewNode(10);
		head.next=new NewNode(12);
		head.next.next = new NewNode(14);
		head.next.next.next = new NewNode(16);
		
		list.display(head);
		head = list.reverseList(head);
		list.display(head);
		
	}

	private NewNode reverseList(NewNode head2) {
		
		NewNode prev=null;
		NewNode next = null;
		NewNode cur=head2;
		
		while (cur!=null) {
			next =cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			
		}
		head2=prev;
		return head2;
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
