package strings;

import java.util.Stack;
import java.util.regex.Pattern;

import javax.naming.spi.DirStateFactory.Result;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "I love Java";
		java.util.Stack<String> st = new java.util.Stack<String>();
		String result ="";
		
		System.out.println("Original String: " + str);
		//char[] ch = s1.toCharArray();
		
		
		
		Pattern p = Pattern.compile("\\s");
		
		String [] temp = p.split(str);
		
		for (int i=0;i<temp.length; i++) {	 
			 st.push(temp[i]);			
			}
	
		 while (!st.isEmpty()) {
			 result =result + st.peek()+" ";
			 st.pop();
		 }
		System.out.println("String after reversing the word:" +result);
		
		
	}

}
