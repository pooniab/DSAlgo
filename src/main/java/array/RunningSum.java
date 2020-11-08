package array;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1};
		if (arr.length<=0) {
			System.out.println("Array is empty");
		}
		int[] runningSum = new int[arr.length];
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			runningSum[i]=sum;
			System.out.println(runningSum[i]);

			
		}
		
	}

}
