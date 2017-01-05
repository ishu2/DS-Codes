package PracticeTrees;

public class QuickSort {

	public static int partition(int[] arr, int start, int end) {
		int j = start;
		int i = j - 1;
		int pivot = arr[end];
		while (j <= end) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		return i;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if(start>=end)
		{
			return;
		}
			int index = partition(arr, start, end);
			quickSort(arr, start, index - 1);
			quickSort(arr, index + 1, end);
	}

	public static void main(String[] args) {
		int[] arr = {10,59,32,69,95,2,45,34};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
