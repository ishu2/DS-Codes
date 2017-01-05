package Practice_Strings;

import java.util.ArrayList;

public class PrintSubsetsOfArray {
	
	public static void printAllSubsets(int[] arr,int[] resultSoFar)
	{
		if(arr.length==0)
		{
			for(int i:resultSoFar)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
			int[] newRes=new int[resultSoFar.length+1];
			for(int j=0;j<resultSoFar.length;j++)
			{
				newRes[j]=resultSoFar[j];
			}
			newRes[newRes.length-1]=arr[0];
			int[] newArr=new int[arr.length-1];
			for(int k=0;k<newArr.length;k++)
			{
				newArr[k]=arr[k+1];
			}
			
			printAllSubsets(newArr,resultSoFar);
			printAllSubsets(newArr,newRes);
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3};
		int[] resultSoFar={ };
		printAllSubsets(arr,resultSoFar);
	}

}
