/**
 *A binary tree class to hold characters that will be used to
 *implement the infix to postfix converter.
 */
public class BTree {

	private TNode root; //field that holds the root node of the BTree
	private String s = "";
	
	/**
	 *Constructor
	 */
	public BTree() {
		root = null;
	}
	
	/**
	 * Returns the root of the BTree
	 *		@return: root TNode of the BTree
	 */
	public TNode getRoot() {
		return root;
	}
	
	//end getRoot
	
	/**
	 *Creates a new node with a character c as element and makes it
	 *the root of the BTree
	 *		@param: a character to be added to the BTree
	 */
	public void addRoot(char c) {
		TNode v = new TNode(c, null, null); //create new node
		if(root == null) //if tree is empty
			root = v;//make v the root
		else
			System.out.println("ERROR");
	}//end addRoot
	
	/**
	 *Makes two seperate BTrees the left and right child of a provided 
	 *TNode v.
	 *		@param: a TNode to be the parent of the subsequent trees.
	 *		@param: a BTree that will become the left child of TNode v
	 *		@param: a BTree that will become the right child of TNode v
	 */
	public void attach(TNode v, BTree T1, BTree T2) {
		if(v.left == null && v.right == null) {
			v.left = T1.root;
			v.right = T2.root;
		}
		else
			System.out.println("ERROR");
	}//end attach
	
	/**
	 *Prints the elements of each TNode in the BTree
	 * in postorder.
	 */
	public String postOrder(TNode v){
		if(v.left != null)
			postOrder(v.left);
		if(v.right != null)
			postOrder(v.right);
		s += v.element;
		return s;
	}//end postOrder
}