package array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		int [] arr = {4,5,2,25};
		int i=0,next,element;
		s1.push(arr[i]);
		for (i = 1; i < arr.length; i++) {
				next=arr[i];
				
			if (s1.empty()==false)
			{
				element = s1.pop();
				while (element < next) {
					System.out.println("element" + "--->" + next);
					if (s1.empty()== true) 
						break;
					element =s1.pop();
				}
				if (element > next) 
					s1.push(element);
				
			}
			s1.push(next);
			while (s1.isEmpty() == false)  
	        { 
	            element = s1.pop(); 
	            next = -1; 
	            System.out.println(element + " -- " + next); 
	        } 
			
		}
	}

}
