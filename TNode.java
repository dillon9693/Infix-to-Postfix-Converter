/**
 *A class that holds elements of char type and creates nodes
 *to be used in a BTree.
 */

public class TNode {
	public char element; //field to hold the element of the node (char type)
	public TNode left; //field that refers to the left child of the TNode
	public TNode right; //field that refers to the right child of the TNode
	
	/**
	 *Constructor
	 *		@param: a character to be the element of the TNode
	 *		@param: a TNode that is the left child of the TNode
	 *		@param: a TNode that is the right child of the TNode
	 */
	public TNode(char c, TNode l, TNode r) {
		element = c;
		left = l;
		right = r;
	}
	
	public void displayNode() {
		System.out.println(element);
	}
}