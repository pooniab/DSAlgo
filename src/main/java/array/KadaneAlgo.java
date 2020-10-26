package array;

public class KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] arr = {1,3,2,5,-2,-1,4,-3};
		int maximum=0, max_till_range=0;
		
		for (int i = 0; i < arr.length; i++) {
			max_till_range = max_till_range+arr[i];
			if (maximum < max_till_range) {
				maximum = max_till_range;
			}
			if (max_till_range <0)
				max_till_range=0;
		}
		System.out.println(maximum);
	}

}
