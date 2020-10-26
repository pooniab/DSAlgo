package array;

public class EquilibriumIndex {
	public static void main(String[] args) {
		int [] arr = {10,5,6,-7,9,5,1,29};
		int size =arr.length;
		int index = checkEqualibrium(arr,size);
		System.out.println(index);
		
		
	}

	private static int checkEqualibrium(int[] arr, int size) {
		
		int sum=0,leftsum=0;

for (int i = 0; i < arr.length; i++) {
			
			sum = sum+arr[i];
			
		}
		System.out.println("total sum of array is " + sum);
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum-arr[i];
			leftsum = leftsum+arr[i];

			//System.out.println("right sum is " + sum);
			//stem.out.println("left sum is" + leftsum);

			if (leftsum==sum) 
				return i;
			//System.out.println("left sum is" + leftsum);
		}
		
		
		
		return -1;
	}
	

}
