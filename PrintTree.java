package PracticeTrees;

import java.util.Scanner;

public class PrintTree {

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

	// ^^^^^ 1. Preorder ^^^^^
	
	public static void printTree1(Node<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printTree1(root.left);
		printTree1(root.right);
	}

	// ^^^^^ 2. Inorder ^^^^^
	
	public static void printTree2(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printTree2(root.left);
		System.out.println(root.data);
		printTree2(root.right);
	}

	// ^^^^^ 3. Postorder ^^^^^^
	
	public static void printTree3(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printTree3(root.left);
		printTree3(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		System.out.println("preorder traversal:");
		printTree1(root);
		System.out.println("inorder traversal:");
		printTree2(root);
		System.out.println("postorder traversal:");
		printTree3(root);
	}

}
