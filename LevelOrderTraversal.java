package PracticeTrees;

import java.util.Queue;
import java.util.Scanner;
import queue.usingArray;

public class LevelOrderTraversal {

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
	
	public static int count(Node<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int c1=0;
	    int c2=0;
	    c1=count(root.left);
	    c2=count(root.right);
	    return c1+c2+1;
	}
	
	public static void printLevelOrderTraversal(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		int size=count(root);
		usingArray obj=new usingArray(size);
		obj.enqueue(root);
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		printLevelOrderTraversal(root);
	}

}
