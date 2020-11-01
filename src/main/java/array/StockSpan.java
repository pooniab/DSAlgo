package array;

//import java.util.Stack;


// Stock span problem says that:  For at Stock price of a given day how many previous conjucative day's price is greater than that day." 
// This Brute force method, we can do it through Stack as well. 
public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {30,10,41,20,40,45};
		int[] span = {1,1,1,1,1,1};
		//Stack<Integer> s1 = new Stack<Integer>();
		
		//s1.push(arr[i]);
		
		for (int i=0;i<arr.length;i++) {
			int count=1;
			for (int j=i-1;j>=0;j--){
				if (arr[j]<arr[i]) {
					count++;
					span[i]=count;

				}
				else 
				break;
			}
			
		}
		
		for (int i=0;i<span.length;i++) {
			System.out.println("Span of day " + arr[i] +" is -> " +span[i]);
		}
	}

}
