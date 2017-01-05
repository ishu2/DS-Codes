package Practice_Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class ReturnIntersectionOfTwoArrays {
	
	public static int[] returnArrayIntersection(int[] arr1,int[] arr2)
	{
		if(arr1.length==0 || arr2.length==0)
		{
			return null;
		}
		ArrayList<Integer> res=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i], 1);
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(map.containsKey(arr2[j]))
			{
				res.add(arr2[j]);
			}
		}
		int size=res.size();
		int j=0;
		int[] result=new int[size];
		for(int i:res)
		{
			result[j]=i;
			j++;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] a1={2,6,8,5,4,3};
		int[] a2={2,3,4,7};
		int[] res=returnArrayIntersection(a1,a2);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
			
	}

}
