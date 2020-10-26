package tree;

public class BinaryTree {
	
	Node root;
	
	BinaryTree(){
		root = null;
	}
	
	
	public void PostorderTraversal (Node node) {
		if (node == null) {
			return;
		}
		PostorderTraversal(node.left);
		PostorderTraversal(node.right);
		System.out.println(node.key);
	}
	
	public void PreorderTraversal (Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.key);
		PreorderTraversal(node.left);
		PreorderTraversal(node.right);

		
	}
	
	public void InorderTraversal (Node node) {
		if (node == null) {
			return;
		}
		InorderTraversal(node.left);
		System.out.println(node.key);
		InorderTraversal(node.right);
	}

	void printPostorder() {
		PostorderTraversal(root);
		}
	void printInOrder() {
		InorderTraversal(root);
	}
	void preOrder() {
		PreorderTraversal(root);
	}
}
