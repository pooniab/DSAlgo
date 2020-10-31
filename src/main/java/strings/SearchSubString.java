package strings;
import java.util.ArrayList;
public class SearchSubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String main = "aaaaacddeffaaaghibcdgsjhf", search = "aaa";
		ArrayList<Integer> l2= SearchSub(main, search);
		System.out.println(l2);
		for (int  i:l2) {
			System.out.println(i);			
		}
	}
	private static ArrayList<Integer> SearchSub(String main, String search) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList();
		int mainlen=main.length();
		int searchlen=search.length();
		if (mainlen<searchlen || searchlen==0) {
			System.out.println("Search Not possible");
			return l1;
		}
		for (int i=0;i<mainlen;i++) {
			System.out.println("Comaparing :" + search.charAt(0) + ": and :" + main.charAt(i));
			if (main.charAt(i)==search.charAt(0)) {
				System.out.println("Found 1 character  : " + search.charAt(0) + ": at ::" +i );
			if (comparenext(main,search,i)) {
				l1.add(i);
			}
			}
			//return l1;
		}
		
	return l1;
	}

	private static boolean comparenext(String main, String search, int i) {
		
		int p2=0;
		
		while (p2<search.length()) {
				System.out.println("Comaparing :" + search.charAt(p2) + ": and :" + main.charAt(i));
				if (search.charAt(p2)!=main.charAt(i)) {
					return false;
					
				}
			p2++;
			i++;				
		}
		return true;
	}

}
