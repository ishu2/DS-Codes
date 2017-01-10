package Practice_Strings;

import java.util.HashSet;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class FindLengthOfLongestConsecutiveSequenceOfNumbers {
	
	/*   Eg- arr={7,3,4,6,1,19,43,21,10,20,2,5}
	 *   length of longest consecutive sequence of numbers=7 AND the
	 *   sequence is {1,2,3,4,5,6,7};
	 *   
	 *   Solution 1: sort the array with O(NlogN) time complexity and then traverse
	 *               the array for finding the desired length.
	 *               
	 *               Time Complexity=O(NlogN + N)
	 *               
	 *   Solution 2:   Optimised Solution
	 *   
	 *              Put all the keys into the HashSet and the traverse the array 
	 *              once. For each element of the array if the hash set contains
	 *              arr[i-1] then just increment the i , otherwise , make count++
	 *              and i++;
	 */
	

	
	public static int partition(int start,int end,int[] arr)
	{
		int pivot=arr[end];
		int j=start;
		int i=j-1;
		while(j<=end)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		return i;
	}
	
	public static void quickSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int mid=partition(start,end,arr);
			quickSort(arr,start,mid-1);
			quickSort(arr,mid+1,end);
		}
	}
	
	public static int findLength1(int[] arr)
	{
		int res=0;
		int count=1;
		int i=0;
		while(i<arr.length-1)
		{
			if(arr[i]==arr[i+1]-1)
			{
				count++;
			}
			else
			{
				res=Math.max(count, res);
				count=1;
			}
			i++;
		}
		return Math.max(res, count);
	}
	
	public static int findLength2(int[] arr)
	{
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
        {
	       set.add(arr[i]);
        }
		int res=1;
		int count=1;
		int i=0;
		while(i<arr.length)
		{
			if(!(set.contains(arr[i]-1)))
			{
				int k=arr[i];
				while(set.contains(k+1))
				{
					count++;
					k=k+1;
				}
				
			}
			else
			{
				res=Math.max(res, count);
				count=1;
			}
			i++;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		int[] arr={1,3,5,7,9,11,1,12,14,13};
		int start=0;
		int end=arr.length-1;
		quickSort(arr,start,end);
		System.out.println("sorted list:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("length of longest consecutive sequence of numbers is :");
		int length1=findLength1(arr);
		System.out.println(length1);
		int length2=findLength2(arr);
		System.out.println(length2);
	}
	

}
