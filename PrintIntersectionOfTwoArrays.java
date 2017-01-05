package Practice_Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintIntersectionOfTwoArrays {
	
	public static void printArrayIntersection(int[] a1,int[] a2)
	{
		if(a1.length==0 || a2.length==0)
		{
			return;
		}
		HashMap<Integer,Integer> map=new HashMap<>(); 
		for(int i=0;i<a1.length;i++)
		{
			map.put(a1[i],1);
		}
		for(int j=0;j<a2.length;j++)
		{
			if(map.containsKey(a2[j]))
			{
				System.out.println(a2[j]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] a1={2,6,8,5,4,3};
		int[] a2={2,3,4,7};
		printArrayIntersection(a1,a2);
	}

}
