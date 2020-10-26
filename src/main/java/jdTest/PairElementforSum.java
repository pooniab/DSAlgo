package jdTest;

import java.util.HashSet;

public class PairElementforSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[]= {1,2,5,6,7} ;
	int sum =8;
	boolean flag;
	flag = checkPair(arr,sum);
	System.out.println(flag);
	

	}
   public static boolean checkPair(int arr[],int sum) {
	   HashSet<Integer> h1 = new HashSet();
	   int tmp;
	   for (int j=0;j<arr.length;j++) {
		   tmp=sum-arr[j];
		   if (h1.contains(tmp)) 
			   return true;
		   else
			   h1.add(arr[j]);
		   System.out.println(h1);
			
		  
	   }   	   
	return false;
	   
   }
}
