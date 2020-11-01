package stack;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {24,14,35,40};
		int n=price.length;
		int span [] = new int[n];
		java.util.Stack<Integer> st = new java.util.Stack<Integer>();
		span[0]=1;
		st.push(0);
		for (int i=1;i<n;i++) {
			
			//while (price[i]>=price[st.peek()] && !st.empty()) 
			while (!st.empty() && price[i]>=price[st.peek()]) {
				st.pop();
			}
				span[i]=(st.empty())? (i+1):(i - st.peek());
				st.push(i);
		}				
		show(span);
	}

	private static void show(int[] span) {
		// TODO Auto-generated method stub
		for (int i = 0; i < span.length; i++) {
			System.out.println(span[i]);
			
		}
		
	}

}
