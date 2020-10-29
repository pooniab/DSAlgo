package strings;

import java.util.HashMap;

// Two strings will be anagram if both strings contain all the character of each other it can be in different order

public class CheckAnagram {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "aaa";
		if (checkAnagram(s1, s2))
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");

	}

	private static boolean checkAnagram(String s1, String s2) {
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>() ;
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>() ;
		//Integer count = 0;
		
		if (s1.length()!=s2.length()) {
			System.out.println("length is not same");
			return false;
		}
		char [] arr1 = s1.toCharArray();
		char [] arr2 = s2.toCharArray();	
		for (int i=0;i<arr1.length;i++) {
			if (h1.get(arr1[i])==null) {
		        h1.put(arr1[i], 1);
			}		
			else
			{
				Integer count=(int)h1.get(arr1[i]);				
                h1.put(arr1[i], ++count); 
             }
		}	

		for (int j=0;j<arr2.length;j++) {
			if (h2.get(arr2[j])==null) {
		        h2.put(arr2[j], 1);
			}		
			else
			{
				Integer count1=(int)h2.get(arr2[j]);				
                h2.put(arr2[j], ++count1); 
             }
		}	
		
		if (h1.equals(h2)) 
			return true;
		else		
			return false;
	}
	
}
