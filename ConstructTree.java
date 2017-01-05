package PracticeTrees;

import java.util.Scanner;

public class ConstructTree {
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

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
	}

}
