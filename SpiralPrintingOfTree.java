package PracticeTrees;

import java.util.Scanner;
import java.util.Stack;

public class SpiralPrintingOfTree {

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
	
	public static void printTreeInSpiralOrder(Node<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		Stack odd=new Stack();
		Stack even=new Stack();
		int h=1;
		even.push(root);
		while(!(even.isEmpty()) || !(odd.isEmpty()))
		{
			System.out.println();
			if(h%2==0)
			{
				while(!(even.isEmpty()))
				{
				Node<Integer> r=(Node<Integer>) even.pop();
				System.out.print(r.data+" ");
				if(r.right!=null)
				{
				odd.push(r.right);
				}
				if(r.left!=null)
				{
				odd.push(r.left);
				}
				}
				h++;
			}
			else
			{
				while(!(odd.isEmpty()))
				{
					Node<Integer> r=(Node<Integer>) odd.pop();
					System.out.print(r.data+" ");
					if(r.left!=null)
					{
					even.push(r.left);
					}
					if(r.right!=null)
					{
					even.push(r.right);
					}				
				}
				h++;
			}
		}
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		printTreeInSpiralOrder(root);
	}

}
