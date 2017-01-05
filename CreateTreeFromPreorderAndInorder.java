package PracticeTrees;

public class CreateTreeFromPreorderAndInorder {

	public static int findIndex(int[] arr, int start, int end, int elt) {
		int i = 0;
		while (start <= end) {
			if (arr[start] == elt) {
				i = start;
				break;
			}
			start++;
		}
		return i;
	}
	static int pos=0;

	public static Node<Integer> createTree(int[] preorder, int[] inorder, int start, int end) {
		if (pos==preorder.length) {
			return null;
		}
		Node<Integer> root = new Node<Integer>(preorder[pos]);
		pos++;
		if (start >= end) {
			return root;
		}
		int index = findIndex(inorder, start, end, preorder[start]);
		root.left = createTree(preorder, inorder, start, index - 1);
		root.right = createTree(preorder, inorder, index + 1, end);
		return root;
	}
	
	public static void printTree1(Node<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		printTree1(root.left);
		printTree1(root.right);
	}

	
	public static void main(String[] args)
	{
		int[] preorder={1,2,3,4,15,5,6,7,8,10,9,12};
		int[] inorder={4,15,3,2,5,1,6,10,8,7,9,12};
		Node<Integer> root=createTree(preorder,inorder,0,preorder.length-1);
		printTree1(root);
	}

}
