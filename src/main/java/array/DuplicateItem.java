package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr = {1};
	int n =arr.length;
	System.out.print("Removing duplicate using HashMap" + "\n");
	removeduplicate(arr,n);
	System.out.println("Removing duplicate using Set");
	removeDuplicateUsingSet(arr,n);

	}

	private static void removeDuplicateUsingSet(int[] arr, int n) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i =0;i<n;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
	}

	private static void removeduplicate(int[] arr, int n) {
		
		HashMap<Integer, Boolean> h = new HashMap<Integer, Boolean>() ;
		
		for (int i=0;i<n;i++) {
			if (h.get(arr[i])==null){
				System.out.println(arr[i]);
				
			}
		h.put(arr[i], true);
		}
		
		// TODO Auto-generated method stub
		
	}

}
