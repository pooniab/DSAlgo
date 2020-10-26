package tree;

public class treeRunner {

	public static void main(String[] args) {
		
		
		BinaryTree btree = new BinaryTree();
		 btree.root = new Node(1);
		 btree.root.left=new Node(2);
		 btree.root.right= new Node(3);
		
		btree.root.left.left = new Node(4);
		btree.root.left.right = new Node(5);
		
		btree.root.right.left=new Node (6);
	   btree.root.right.right= new Node (7);
		
//		b1.InorderTraversal(root);
//		b1.PreorderTraversal(root);
//		b1.PreorderTraversal(root);
//	
	   System.out.println("Displaying inorder traversal");
		btree.printInOrder();
		   System.out.println("Displaying Postorder traversal");

		btree.printPostorder();
		   System.out.println("Displaying Preorder traversal");

		btree.preOrder();
		
		// TODO Auto-generated method stub

	}

}
