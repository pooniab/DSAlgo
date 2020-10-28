package array;

public class maxDiffIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int arr[] = {8,10,32,52,9,80,7};
	int len = arr.length;
	
    
    System.out.println("maximum differenc is :" + findMax(arr,len));

    
    

	}

	private static int findMax(int[] arr, int len) {
		
	    int current_max=arr[1]-arr[0];
	    int min_element = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	    	
	    	int max=arr[i]-min_element;
	    	
	    	if (max > current_max)
	    	{
	    		current_max=max;
	    	}
			if (arr[i]<min_element) {
				min_element=arr[i];
			}
		}
	    
	    
		// TODO Auto-generated method stub
		return current_max;
	}

}
