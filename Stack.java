/**
 * A class  that implements a simple stack of BTrees
 * with an array of size 100.
 */

public class Stack {
	
	private int top; // variable that holds the top of the stack
	private int size; //size of the stack
	private BTree[] a; //array that holds the stack
	
	/**
	 * Constructor
	 */
	public Stack(){
		top = -1;
		size = 0;
		a = new BTree[100];
	}
	
	/**
	 * Adds a BTree to the top of the stack.
	 *		@param BTree to be added to the stack
	 */
	public void push(BTree e){
		a[size] = e;
		size++;
		top++;
			
	}
	
	/**
	 * Removes and returns a BTree from the top of the stack.
	 *		@return BTree that is removed from the stack
	 */
	public BTree pop(){
		BTree popped = a[top];
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
	 * Checks the BTree at the top of the stack
	 *		@return BTree at top of stack
	 */
	public BTree peek(){
		return a[top];
	}
	
	/**
	 * Returns the size of the stack.
	 *		@return number of BTrees in the stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Displays each BTree in the stack.
	 */
	public void display(){
		for(int k = 0; k < size; k++){
			System.out.print(a[k] + ",");
		}
		System.out.println("");
	}
	
}
/**
 * A class to test the methods of the stack.
 
class StackTest{
	public static void main(String args[]) {
		Stack s = new Stack();
		
		s.push('{');
		s.display();
		s.push('[');
		s.display();
		s.push('(');
		s.display();
		s.pop();
		s.display();
		System.out.println("Size = " + s.size());

	}
}
*/