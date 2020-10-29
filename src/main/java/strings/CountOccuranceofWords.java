package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class CountOccuranceofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hate love hate Java I Test";
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		Pattern p1 = Pattern.compile("\\s");
		String [] temp = p1.split(str);
		
		for (int i=0;i<temp.length;i++) {
			if (h1.containsKey(temp[i]))
			{
				int count = h1.get(temp[i]); 
				h1.put(temp[i], count+1); 
			}
			else {
				h1.put(temp[i], 1);
			}
			
			}
		int res =0;
		for (Map.Entry <String,Integer> it : h1.entrySet()) {
			if (it.getValue()==2) {
				res++;
				System.out.println("Repeated string is ::" + it.getKey()+ "and count is : " + res);

			
			}
				
		}

	
	
	
	
	
	
	}
	 

}





