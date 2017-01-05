package Practice_Strings;

public class PrintSubsetsWhichSumToK {

	public static void printSubsetsSumToK(int[] arr,int i,int sum,int[] resultSoFar)
	{
		if(i==arr.length)
		{
		 if(sum==0)
		 {
			for(int k:resultSoFar)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		 }
		 return;
		}
		printSubsetsSumToK(arr,i+1,sum,resultSoFar);
		int[] newRes=new int[resultSoFar.length+1];
		for(int k=0;k<resultSoFar.length;k++)
		{
			newRes[k]=resultSoFar[k];
		}
		newRes[newRes.length-1]=arr[i];
		printSubsetsSumToK(arr,i+1,sum-arr[i],newRes);
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2 };
		int index = 0;
		int sum = 5;
		int[] resultSoFar = {};
		printSubsetsSumToK(arr, index, sum, resultSoFar);
	}

}
