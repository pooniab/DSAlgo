package strings;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String [] arr = {"player","playground","playing","playness","playing"};
		int n = arr.length;
		
		int shortest = shortlestLengh(arr,n);
		
		String common = findPrefix(arr,shortest);
		//System.out.println(shortest);
		System.out.println(common);
	}

	private static String findPrefix(String[] arr, int shortest) {
		int length = arr.length;
		String prefix =" ";
		
		char comparingCharacter;
		
		for (int j=0;j<shortest;j++) {
			comparingCharacter=arr[0].charAt(j);
			//System.out.println("character being compared is:" + comparingCharacter);
		
		
		for (int i = 1; i < arr.length; i++) {
			if (comparingCharacter!=arr[i].charAt(j))
			return prefix;
			
		 }
		prefix+=comparingCharacter;
		}
		return prefix; 
	}

	private static int shortlestLengh(String[] arr, int n) {
		
		int shortest = arr[0].length();
		
		for (int i=1;i<n;i++) {
			int newlengh = arr[i].length();
			if (shortest > newlengh)
				shortest=newlengh;
			
		}
				
		// TODO Auto-generated method stub
		return shortest;
	}

	
	// Finding longest prefix by matching Strings
	  
//	private static String findPrefix(String[] arr, int n) {
//		
//		String commonString =arr[0];
//		
//		for (int i=1;i<=n;i++) {
//			
//			commonString = FindCommonString(commonString,arr[i]);
//		}
//		// TODO Auto-generated method stub
//		return commonString;
//	}
//
//	private static String FindCommonString(String commonString, String string) {
//		
//		String commonChar=" ";
//		int lenghofFirstString =commonString.length();
//		int lenghofSecondString=string.length();
//		
//		for (int i=0,j=0;i < lenghofFirstString && j<lenghofSecondString;i++,j++) {
//			if (commonString.charAt(i)!=string.charAt(i))
//				break;
//			commonChar=commonChar + commonChar.charAt(i);
//
//		}
//		// TODO Auto-generated method stub
//		return commonChar;
//	}

	
	
	
}
