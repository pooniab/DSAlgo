package tree;

import tree.Sol.Node;

public class IsBST {

static node root;
public static class node {
	//node root=null;
	node left=null;
	node right=null;
	int data;
	public node (int data) {
		this.data=data;
	}
}
	public static void main(String[] args) {
		
		IsBST t = new IsBST();
		t.root=new node(10);
		t.root.left = new node(25);
		t.root.right = new node (16);
		t.root.left.left = new node (4);
		t.root.left.right = new node (7);
		t.root.right.left= new node(14);
		t.root.right.right = new node (18);
		
		if (t.isBSTree(root,null,null)) {
			System.out.println("Tree is BST");
		}
		else
			System.out.println("Tree is not BST");
		
		
		
		
	
		
	}
	
		static boolean isBSTree(node root, node l, node r)  
		{  
		 if (root == null)  
		     return true;  
		 if (l != null && root.data <= l.data)  
		     return false;  
		 if (r != null && root.data >= r.data)  
		     return false;  
		 return isBSTree(root.left, l, root) &&  isBSTree(root.right, root, r);  
		}  
		
  

}
