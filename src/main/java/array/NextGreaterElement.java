package array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		int [] arr = {7,6,12};
		int next,element = 0;
		//int greater [] = new int[arr.length];
		s1.push(arr[0]);
		for (int i=1;i<arr.length;i++) {
			next = arr[i];
			if (s1.isEmpty() == false) 
				element=s1.pop();							
			while (next>element) {
			System.out.println("NG of" + element + " is " + next);
			if (s1.isEmpty()==true)
				break;
				element=s1.pop();
					
			}			
			if (next<element) 
				s1.push(element);

			s1.push(next);

		}
				
	
	
		while (s1.isEmpty()==false) {
			element = s1.pop();
			next =-1;
			System.out.println("NG of" + element + " is " + next);

		}
			
	}		
}			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//		{
//			int element=s1.pop();
//			if (arr[i]<element) 
//			{
//				s1.push(arr[i]);
//			}
//			else
//			{
//				while (arr[i]>element) {
//					System.out.println("Next Greater item to : " + element + " is -> " + arr[i]);
//					System.out.println("status of stack " +s1.empty());
//					if (s1.empty()==false)
//					break;
//					element = s1.pop();
//					System.out.println("value of element is " + element);
//				}
//				s1.push(arr[i]);
//				
//			}
//			int next=arr[i];
//			System.out.println("next is :" + arr[i]);
//			System.out.println("status of stack is " + s1.isEmpty() );
//			if (s1.isEmpty()==false) {
//				int element=s1.pop();
//				System.out.println("value of top is " + element);
//
//				if(element>next) {
//					System.out.println("Pushing next : " + next);
//					s1.push(next);
//					System.out.println("value of top is " + s1);
//
//				}
//				else 
//				{
//					while (element<next) {
//						System.out.println("Next Greater item to : " + element + " is -> " + next);
//						if (s1.isEmpty()==false)
//							element=s1.pop();
//						else
//							s1.push(next);
//
//					}
//				}
//			}
		
//		}
		
		//while (s1.empty()==false) {
			//System.out.println("Next Greater item to : " + s1.peek() + " is -> " + -1);
		//	s1.pop();
//			
//		}
//		
//	}
//
//}
