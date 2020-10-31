package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dupItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "Javaava";
//		
//		Map<Character,Integer > m = new HashMap<>();
//		
//	   for (int i=0;i<arr.length();i++) {
//			int count = (int)(m.get(arr.charAt(i)));
//			if (m.get(arr.charAt(i)) == null) {
//				m.put(arr.charAt(i), count);
//			}
//			else
//				m.put(arr.charAt(i), count++); 
//		}
//		

		
		Set<Character> ch = new HashSet ();
		for (int i=0;i<arr.length();i++)
		{
			ch.add(arr.charAt(i));
		}
		for (char c : ch) {
			System.out.print(c);
		}
		
	}

}
