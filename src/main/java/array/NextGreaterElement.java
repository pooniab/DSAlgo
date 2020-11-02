package array;
import java.util.Stack;

// Find the Next greater item in Array. 

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		int [] arr = {13,7,6,12,25};
		int next,element = 0;
		//int greater [] = new int[arr.length];
		s1.push(arr[0]);
		for (int i=1;i<arr.length;i++) {
		
		if (arr[i]<s1.peek())
			
		{
			s1.push(arr[i]);
			
		}
		if (arr[i]>s1.peek()) {
			while (s1.empty()==false && arr[i]>s1.peek()) {
				System.out.println(s1.peek() + "-->" + arr[i] );
				if(s1.isEmpty()==true)
					break;
				s1.pop();
			}
		}
		s1.push(arr[i]);

//Another Method
		
//			next = arr[i];
//			if (s1.isEmpty() == false) 
//				element=s1.pop();							
//			while (next>element) {
//			System.out.println("NG of" + element + " is " + next);
//			if (s1.isEmpty()==true)
//				break;
//				element=s1.pop();
//					
//			}			
//			if (next<element) 
//				s1.push(element);
//
//			s1.push(next);

}
					
		while (s1.isEmpty()==false) {
			
			next =-1;
			System.out.println(s1.peek() + "-->" + next);
			s1.pop();



		}
			
	}		
}					
			