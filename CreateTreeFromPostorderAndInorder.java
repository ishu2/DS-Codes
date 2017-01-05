package PracticeTrees;

public class CreateTreeFromPostorderAndInorder {

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
    static int i=.length-1;
	public static Node<Integer> createTree(int[] postorder, int[] inorder, int start, int end) {
		if(i<0)
		{
			return null;
		}
		Node<Integer> root = new Node<Integer>(postorder[i]);
		if (end <= start) {
			return root;
		}
		int index = findIndex(inorder, start, end,postorder[i]);
		i--;
		root.left = createTree(postorder, inorder, start, index - 1);
		root.right = createTree(postorder, inorder, index + 1, end);
		return root;
	}
    
	public static void printTree2(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printTree2(root.left);
		System.out.println(root.data);
		printTree2(root.right);
	}


    
    public static void main(String[] args) {
	int[] post={8,4,5,2,6,7,3,1};
	
	int[] in={4,8,2,5,1,6,3,7};
    Node<Integer> root=createTree(post,in,0,in.length);
    printTree2(root);
	}

}
