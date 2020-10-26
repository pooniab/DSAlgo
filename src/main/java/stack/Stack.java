package stack;

public class Stack {
	    int [] stackarr = new int[7];
	    int top =0;
		public void push (int data)
		{
			if (top < 7) {
				stackarr[top]=data;
				top++;
			}
			else 
				System.out.println("Stack out of bound exception");
		
		}
		public void show() {
			for (int i=0;i<top;i++) {
				System.out.println("Stacak elements" + stackarr[i]);
			}
		}
		public void pop() {
			
			if (top>0) {
			
				stackarr[top]=0;
				top--;
			}
			else
				System.out.println("Stack inboud exception");
			
				
			
		}

}
