package Practice_Strings;

public class TripletSum {

	public static void mergeSort(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return;
		}
		int mid = (arr.length) / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[arr.length - mid];
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = arr[i];
		}
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = arr[i + mid];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, arr);
	}

	public static void merge(int[] left, int[] right, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		if (i < left.length) {
			while (i < left.length) {
				arr[k] = left[i];
				i++;
				k++;
			}
		}
		if (j < right.length) {
			while (j < right.length) {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
	}

	public static void tripletSum(int[] arr, int num) {
		if (arr.length == 0) {
			return;
		}
		int start = 0;
		int sum = num;
		int end = arr.length - 1;
		for (int i = 0; i < arr.length - 2; i++) {
			num = sum;
			num = num - arr[i];
			start = i + 1;
			end = arr.length - 1;
			while (start < end) {
				if (arr[start] + arr[end] > num) {
					end--;
				} else if (arr[start] + arr[end] < num) {
					start++;
				} else {
					if (arr[start] == arr[end]) {
						int c = end - start;
						int count = c;
						while (c != 1) {
							count = count + (c - 1);
							c--;
						}
						for (int l = 0; l < count; l++) {
							System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
						}
						break;
					} else {
						int k = start;
						int l = end;
						int count1 = 1;
						int count2 = 1;
						while (arr[k] == arr[k + 1]) {
							count1++;
							k++;
						}
						while (arr[l] == arr[l - 1]) {
							count2++;
							l--;
						}
						int c = count1 * count2;
						for (int m = 1; m <= c; m++) {
							System.out.println(arr[i] + " " + arr[start] + " " + arr[end]);
						}
						start = k + 1;
						end = l - 1;

					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {25,21,18,12,8,13,30,3};
		mergeSort(arr);
		tripletSum(arr, 28);
	}

}
