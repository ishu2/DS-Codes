package PracticeTrees;

import java.util.Scanner;

public class LCAofBST {

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

	public static Node<Integer> lca(Node<Integer> root, int data1, int data2) {
		if (root == null) {
			return null;
		}
		if (root.data >= data1 && root.data < data2) {
			return root;
		}
		else if(root.data>data1 && root.data<=data2)
		{
			return root;
		}
		Node<Integer> left = lca(root.left, data1, data2);
		if (left != null) {
			return left;
		}
		Node<Integer> right = lca(root.right, data1, data2);
		if(right!=null)
		{
			return right;
		}
		return null;
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		Node<Integer> res=lca(root,70,185);
		if(res!=null)
		{
			System.out.println("LCA of 70 and 185 is:"+res.data);
		}
		else
		{
			System.out.println("do not exist.");
		}
	}

}
