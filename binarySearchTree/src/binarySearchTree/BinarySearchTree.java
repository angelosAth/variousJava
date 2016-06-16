package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

//class for the nodes of the tree
class Node{
	Node left, right;
	int data;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree {
	
	//node insertion in the tree 
	public static Node insert(Node root, int data){
		//if the tree is empty create the root
		if(root == null){
			return new Node(data);
		}else{
	            //else if the new element is greater than the parent node
		    //make it a right child otherwise a left child
		    Node cur;
		    if(data <= root.data){
			    cur = insert(root.left, data);
			    root.left = cur;
		    }else{
		    	cur = insert(root.right, data);
		    	root.right = cur;
		    }
		    return root;
		}
	}
	
	//get the height of bst tree
	public static int getHeight(Node root){
		if(root == null)
			return -1;
		return 1 + (Math.max(getHeight(root.left), getHeight(root.right)));
	}
	
	//breadth first search (level order traversal)
	public static void breadthFirstSearch(Node root){
		Queue<Node> q = new LinkedList<Node>();
		if(root != null){
	          q.add(root);
	          while(!q.isEmpty()){
	              Node t = q.remove();
	              System.out.print(t.data + " ");
	              if(t.left != null){
	                  q.add(t.left);
	              }
	              if(t.right != null){
	                  q.add(t.right);
	              }
	          }
	      }
	}
	
	//in order traversal
	public static void inOrderTraverse(Node root){
		if(root != null){
			inOrderTraverse(root.left);
			System.out.print(root.data + " ");
			inOrderTraverse(root.right);
		}
	}
	
	// post order traversal
	public static void postOrderTraverse(Node root){
		if(root != null){
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	//depth first search (pre order traversal)
	public static void preOrderTraverse(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}
	}
		

	public static void main(String[] args) {
		
		int[] test = {3, 9, 7, 4, 8, 2, 1, 6, 5};
		Node root = null;
		
		for(int data : test){
			root = insert(root, data);
		}
		
		System.out.println("The height of the tree: " + getHeight(root));
		System.out.print("bfs: ");
		breadthFirstSearch(root);
		System.out.print("\ninOrder traverse: ");
		inOrderTraverse(root);
		System.out.print("\npostOrder traverse: ");
		postOrderTraverse(root);
		System.out.print("\npreOrder traverse(dfs): ");
		preOrderTraverse(root);
	}

}
