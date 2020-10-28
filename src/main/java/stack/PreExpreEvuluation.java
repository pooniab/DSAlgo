package stack;

public class PreExpreEvuluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression ="*7+36";
		System.out.println(solveExpression(expression));
	}
   
	public static boolean isOprand(char ch) {
		
		if ((ch >=48) && (ch <=57)) {
			return true;
		}
		else 
			return false;
	}
	
	
	static Double solveExpression(String expression) {
		// TODO Auto-generated method stub
		
		java.util.Stack<Double> s1 = new java.util.Stack<Double>();
		for (int i=expression.length() - 1;i>=0;i-- ) {
			
			if (isOprand(expression.charAt(i))) {
				
				s1.push((double)(expression.charAt(i) - 48));
			}
			else {
				double firstOprand = s1.peek();
				s1.pop();
				double SecondOprand = s1.peek();
				s1.pop();
				switch (expression.charAt(i)) 
				{
					case '+' : s1.push(firstOprand+SecondOprand);
					break;
					case '-' : s1.push(firstOprand-SecondOprand);
					break;
					case '*' : s1.push(firstOprand*SecondOprand);
					break;
					case '/' : s1.push(firstOprand/SecondOprand);
					break;
					
				}
			}
		}
		return s1.peek();	

	}

}
