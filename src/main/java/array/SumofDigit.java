package array;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 518;
		int mod;
		int sum;

		sum = calculateSum(num);
		
		if ((sum/10)>0) {
			int k=0;
			sum = calculateSum(sum);
		}
		
		
		System.out.println(sum);


	}

	public static int calculateSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while (num>0) {
			
			sum =sum + (num%10);
			num = num /10;

			
		}
		
		return sum;
	}

}
