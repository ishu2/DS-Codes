package PracticeTrees;

import java.util.Scanner;

public class HeightOfTree {

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

	public static int height(Node<Integer> root)
	{
	if(root==null)
	{
	return 0;
	}
	int height1=0;
	int height2=0;
	height1=height1+height(root.left);
	height2=height2+height(root.right);
	/*if(height1>height2)
	{
	return height1+1;
	}
	else
	{
	retrun height2+1;
	} */
	return Math.max(height1,height2)+1;
	}

	
	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		int res=height(root);
		System.out.println("height of tree is:"+res);
	}

}
