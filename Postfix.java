/**
 * A class that contains methods that evaluates an expression
 * in postfix notation.
 */

public class Postfix {
	
	private char[]  operator = {'+', '-', '*', '/'}; //hard coded array holding the operators
	private DStack list = new DStack(); // stack of doubles
	/**
	 * Checks if char c is a mathematical operator
	 *		@param: a character to be checked
	 *		@return: true if char c is an operator, false if otherwise
	 */
	public boolean isOperator(char c) {
		for(int i = 0; i < operator.length; i++) {
			if( c == operator[i])
				return true;
		}
		return false;
	}
	
	/**
	 * Checks char oper to find out what operation to perform, performs that operation
	 * on the two parameters
	 *		@param: two double values to perform an operation on
	 *		@param: a character representing the operation to be performed
	 *		@return: double value of the result of the operation on the two paramets
	 */
	public double calculate(double first, double second, char oper) {
		double total = 0;
		if(oper == '+')
			total = first + second;
		else if (oper == '-')
			total = first - second;
		else if(oper == '*')
			total = first * second;
		else
			total = first / second;
		return total;
	}
	/**
	 * Calculates the value of the input in postfix notation rounded to two decimal places.
	 *and returns the result.
	 *		@param: String of numbers and operators in postfix notation to be evaluated
	 *		@return: double value of the result of the postfix evaluation. returns -1 if
	 *				postfix notation is invalid
	 */
	public double checkPostfix(String s) {
		char[] array = s.toCharArray();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ')
				if(!isOperator(s.charAt(i))) {
					double a = Character.digit(s.charAt(i), 10);
					list.push(a);
			}
				else {
					char oper = s.charAt(i);
					double second = list.pop();
					double first = list.pop();
					double sum = calculate(first, second, oper);
					list.push(sum);
				}
		}
		double d = list.pop();
		int a = (int)(d * 100.0);
		double d2 = ((double)a) / 100.0;
		if(list.size() == 0)
			return d2;
		else
			System.out.println("Postfix notation is invalid.");
			return -1.0;
		
	}
}
		
		
		























