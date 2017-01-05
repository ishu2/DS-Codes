package PracticeTrees;

import java.util.Scanner;

public class FindLCA {

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
		if (root.data == data1 || root.data == data2) {
			return root;
		}
		Node<Integer> left = lca(root.left, data1, data2);
		Node<Integer> right = lca(root.right, data1, data2);
		if (left == null && right != null) {
			return right;
		} else if (right == null && left != null) {
			return left;
		} else if(left!=null && right!=null) {
			return root;
		}
		else
		{
			return null;
		}
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		Node<Integer> res=lca(root,30,170);
		if(res!=null)
		{
		 System.out.println("lca of 30 and 170 is:"+res.data);
		}
		else
		{
			System.out.println("do not exist");
		}
	}

}
