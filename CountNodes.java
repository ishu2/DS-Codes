package PracticeTrees;

import java.util.Scanner;

public class CountNodes {

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

	public static int count(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count1 = 0;
		int count2 = 0;
		count1 = count1 + count(root.left);
		count2 = count2 + count(root.right);
		return count1 + count2 +1;
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		int res=count(root);
		System.out.println("number of nodes int tree are:"+res);
	}

}
