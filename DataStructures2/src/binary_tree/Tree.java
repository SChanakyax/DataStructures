package binary_tree;

public class Tree {

	private Node root;
	public void Tree() {
		root=null;
	}
	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		if(root==null) {//no node in root
			root = newNode;
		}else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				
				if(id<current.iData) {//go left
					current = current.leftChild;
					if(current==null) {
						parent.leftChild = newNode;
						return;
					}//2if
				}//1if
				else {
					current = current.rightChild;
					if(current==null) {
						parent.rightChild = newNode;
						return;
					}
				}//1else
				
				
			}//while
		}
		
	}
	
	public Node find(int key) {
		Node current = root;
		
		while(current.iData!=key) {
			if(key<current.iData) {
				current = current.leftChild;
			}else {
				current = current.rightChild;
			}
			
			if(current==null) {
				return null;
			}
		}
		return current;
	}
	
	public boolean delete(int id) {
		return true;
	}
	
	public void inOrder(Node localRoot) {
		if(localRoot !=null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void preOrder(Node localRoot) {
		if(localRoot !=null) {
			localRoot.displayNode();
			inOrder(localRoot.leftChild);
			inOrder(localRoot.rightChild);
		}
	}
	
	public void postOrder(Node localRoot) {
		if(localRoot !=null) {
			inOrder(localRoot.leftChild);
			inOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
}
