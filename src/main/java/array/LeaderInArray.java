package array;

public class LeaderInArray {
	
	public static void main(String[] args) {
		
		int [] arr = {3,5,3,9,6,7,4};
		int len=arr.length;
		findLeader(arr,len);
	}

	private static void findLeader(int[] arr, int len) {
		// TODO Auto-generated method stub
		
	int leader= arr[len-1];

	System.out.println(leader);
	
	for (int i=len-2;i>=0;i--) {

		if (arr[i]>leader) {
			
			System.out.println(arr[i]);
			leader=arr[i];

			
		}

		
	}
		
	}

}
