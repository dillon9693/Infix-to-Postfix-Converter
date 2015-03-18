/**
 * A class  that implements a simple stack of doubles
 * with an array of size 100.
 */

public class DStack {
	
	private int top; // variable that holds the top of the stack
	private int size; //size of the stack
	private double[] a; //array that holds the stack
	
	/**
	 * Constructor
	 */
	public DStack(){
		top = -1;
		size = 0;
		a = new double[100];
	}
	
	/**
	 * Adds a char value to the top of the stack.
	 *		@param double value to be added to the stack
	 */
	public void push(double e){
		a[size] = e;
		size++;
		top++;
			
	}
	
	/**
	 * Removes and returns a char value from the top of the stack.
	 *		@return double value that is removed from the stack
	 */
	public double pop(){
		double popped = a[top];
		top--;
		size--;
		return popped;
	}
	/**
	 * Returns true if stack is empty, false otherwise
	 *		@return true if stack is empty, false otherwise
	 */
	public boolean isEmpty(){
		if(size == 0)
			return true;
		else
			return false;
	}
	
	/** 
	 * Checks the double value at the top of the stack
	 *		@return double value at top of stack
	 */
	public double peek(){
		return a[top];
	}
	
	/**
	 * Returns the size of the stack.
	 *		@return number of double values in the stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Displays each double value in the stack.
	 */
	public void display(){
		for(int k = 0; k < size; k++){
			System.out.print(a[k] + ",");
		}
		System.out.println("");
	}
	
}
