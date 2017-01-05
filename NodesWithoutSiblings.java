package PracticeTrees;

import java.util.Scanner;

public class NodesWithoutSiblings {

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

	public static void printNodesWithoutSiblings(Node<Integer> root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right != null) {
			System.out.println(root.right.data);
		}
		if (root.right == null && root.left != null) {
			System.out.println(root.left.data);
		}
		printNodesWithoutSiblings(root.left);
		printNodesWithoutSiblings(root.right);
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		printNodesWithoutSiblings(root);
	}

}
