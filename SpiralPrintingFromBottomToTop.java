package PracticeTrees;

import java.util.Scanner;
import java.util.Stack;

public class SpiralPrintingFromBottomToTop {

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

	
	public static int[] printSpirally(Node<Integer> root)
	{
		if(root==null)
		{
			int[] arr=new int[0];
			return arr;
		}
		Stack odd=new Stack();
		Stack even=new Stack();
		int size=count(root);
		int[] arr=new int[size];
		int i=0;
		int f=1;
		even.push(root);
		while(!(odd.isEmpty()) || (!(even.isEmpty())))
		{
		  	if(f%2==0)
		  	{
		  		f++;
		  		while(!odd.isEmpty())
		  		{
		  			Node<Integer> res=(Node<Integer>) odd.pop();
		  			arr[i]=res.data;
		  			i++;
		  			if(res.right!=null)
		  			{
		  				even.push(res.right);
		  			}
		  			if(res.left!=null)
		  			{
		  				even.push(res.left);
		  			}
		  		}
		  	}
		  	else
		  	{
		  		f++;
		  		while(!even.isEmpty())
		  		{
		  			Node<Integer> res=(Node<Integer>) even.pop();
		  			arr[i]=res.data;
		  			i++;
		  			if(res.left!=null)
		  			{
		  				odd.push(res.left);
		  			}
		  			if(res.right!=null)
		  			{
		  				odd.push(res.right);
		  			}
		  		}
		  	}
		}
		return arr;
	}

	public static void main(String[] args) {
		Node<Integer> root = constructTree();
		int[] res=printSpirally(root);
		int i=0;
		int j=res.length-1;
		while(i<j)
		{
			int temp=res[i];
			res[i]=res[j];
			res[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
