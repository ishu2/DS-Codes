package PracticeTrees;

import java.util.Scanner;

public class FindMaximum {

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
	
	public static int max(Node<Integer> root)
	{
		if(root==null)
		{
			return -1;
		}
		int largest=Integer.MIN_VALUE;
		if(root.data>largest)
		{
			largest=root.data;
		}
		int l1=max(root.left);
		int l2=max(root.right);
		return Math.max(Math.max(l1, l2),largest);
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		int res=max(root);
		System.out.println("largest element in tree is:"+res);
	}

}
