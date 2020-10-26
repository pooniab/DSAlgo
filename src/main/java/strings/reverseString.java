package strings;


public class reverseString 

{
//	
	public static void main (String [] args) {
//		
//	String input ="Reverse the string";
//	
//	char [] rev = input.toCharArray();
//	
//	System.out.println(rev.length);
//	
//	for (int i =rev.length -1; i>=0; i--) {
//		System.out.println(rev[i]);
//	}
//		
//	}


    String input = "Geeks For Geeks";
    char[] temparray = input.toCharArray();
    int left;
    int right = 0;
    right = temparray.length - 1;

    for (left = 0; left < right; left++, right--) {
        // Swap values of left and right
        char temp = temparray[left];
        temparray[left] = temparray[right];
        temparray[right] = temp;
    }

    for (char c : temparray)
        System.out.print(c);
    System.out.println();
}




}
