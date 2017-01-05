package PracticeTrees;

import java.util.Scanner;

public class RemoveLeafNodes {

	static Scanner s = new Scanner(System.in);

	public static Node<Integer> constructTree() {
		System.out.println("Enter root data");
		int rootdata = s.nextInt();
		if (rootdata == -1) {
			return null;
		}
		Node<Integer> root = new Node<Integer>(rootdata);
		root.left = constructTree();
		root.right = constructTree();
		return root;
	}

	public static Node<Integer> removeAllLeaves(Node<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		Node<Integer> res=root;
		res.left = removeAllLeaves(root.left);
		res.right = removeAllLeaves(root.right);
		return res;
	}
	
	public static void printTree2(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printTree2(root.left);
		System.out.println(root.data);
		printTree2(root.right);
	}


	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		Node<Integer> res=removeAllLeaves(root);
        printTree2(root);		
	}

}
