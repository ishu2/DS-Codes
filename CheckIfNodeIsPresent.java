package PracticeTrees;

import java.util.Scanner;

public class CheckIfNodeIsPresent {

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
	
	public static boolean checkIfPresent(Node<Integer> root,int data)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		boolean res=checkIfPresent(root.left,10000);
		if(res==false)
		{
		  res=checkIfPresent(root.right,10000);
		}
		  return res;
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		boolean res = checkIfPresent(root, 10000);
		System.out.println(res);
	}

}
