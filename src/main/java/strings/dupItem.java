package strings;

import java.util.HashMap;
import java.util.Map;

public class dupItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,6,8,4,2,1,7,8};
		
		Map<Integer,Integer > m = new HashMap<>();
		
		for (int i : arr) {
			int count = m.get(i);
			if (count == 0) {
				m.put(i, 1);
			}
			else
				m.put(i, count++); 
		}
		
		
	}

}
