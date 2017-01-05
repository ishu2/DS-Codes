package PracticeTrees;

import java.util.Scanner;

public class IsTreeBST {

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
	
	public static boolean isTreeBST(Node<Integer> root)
	{
		if(root.left==null && root.right==null)
		{
			return true;
		}
		boolean res=isTreeBST(root.left);
		int left=maxInLeft(root.left);
		int right=minInRight(root.right);
		if(root.data>left && root.data<right)
		{
			res=isTreeBST(root.right);
		}
		return false;
	}
	
	public static int maxInLeft(Node<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		if(root.right==null)
		{
			return root.data;
		}
		int res=maxInLeft(root.right);
		return res;
	}
	
	public static int minInRight(Node<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		if(root.left==null)
		{
			return root.data;
		}
		int res=minInRight(root.left);
		return res;
	}
	
/*	public static int maxInLeft(Node<Integer> root)
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
	  int l1=maxInLeft(root.left);
	  int l2=maxInLeft(root.right);
	  return Math.max(Math.max(l1, l1),largest);
	}
	
	public static int minInRight(Node<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		int smallest=Integer.MAX_VALUE;
		if(root.data<smallest)
		{
			smallest=root.data;
		}
		int l1=minInRight(root.left);
		int l2=minInRight(root.right);
		return Math.min(Math.min(l1, l2),smallest);
	}
*/	
	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		boolean res=isTreeBST(root);
		System.out.println(res);
	}

}
