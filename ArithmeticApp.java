/**
 *A class that receives input from the user of a mathematical
 *expression in infix notation and converts it to postfix notation.
 */

import java.util.Scanner; //imports Scanner to receive input from the user

public class ArithmeticApp {
	
	/**
	 *Receives a string as input and puts each character
	 *into a binary tree in correct order.
	 *		@param: a string in infix notation
	 *		@return: a BTree holding each character in the string
	 */
	public BTree buildExpression(String s) {
		Stack stack = new Stack(); // creates a new Stack
		for(int i = 0; i < s.length(); i++) {
		//loop through each character in the string
			char f = s.charAt(i); // sets f to the current character
			if(f != '(' && f != ')') { 
			// if f is an integer or operator
				BTree T = new BTree(); //creates a new BTree
				T.addRoot(f); //adds a Node holding f as the root
				stack.push(T); //pushes the BTree
			}
			else if(f == ')') { //if f is a closed parenthesis
				BTree t2 = stack.pop(); //pop the stack 3 times
				BTree tree = stack.pop();
				BTree t1 = stack.pop();
				tree.attach(tree.getRoot(), t1, t2); 
				//attach the three BTrees in the stack
				stack.push(tree); //add the new tree to the stack
			}
		}
		return stack.pop(); //returns the compeleted BTree
	}
	
	/**
	 *A main method that receives an input String from the user of a
	 *mathematical expression in infix notation and converts it to postfix
	 *notation.
	 */
	public static void main(String args[]) {
		ArithmeticApp a = new ArithmeticApp(); //create new ArithmeticApp
		Scanner s = new Scanner(System.in);//create a new Scanner
		System.out.print("Enter an expression in infix notation: ");//prompt the user for input
		String infix = s.next();//store input in variable
		BTree tree = a.buildExpression(infix);//call the buildExpression method on the string
		String postfix = tree.postOrder(tree.getRoot());//print the input in postorder(postfix notation)
		System.out.println("Postfix notation: " + postfix);
		Postfix p = new Postfix();
		System.out.println("The answer is " + p.checkPostfix(postfix));
		//tree.displayTree();
	}
}
		
			