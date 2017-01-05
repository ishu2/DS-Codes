package PracticeTrees;

import java.util.Scanner;

public class SumOfAllNodes {

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
	
	public static int sum(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int sum1=0;
		int sum2=0;
		sum1=sum1+sum(root.left);
		sum2=sum2+sum(root.right);
		return sum1+sum2+root.data;
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		int res=sum(root);
		System.out.println("sum = "+res);
	}

}
