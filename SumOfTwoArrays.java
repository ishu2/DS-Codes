package Practice_Strings;

public class SumOfTwoArrays {
	
	public static int[] findSum(int[] arr1,int[] arr2)
	{
		if(arr1.length==0)
		{
			return arr2;
		}
		if(arr2.length==0)
		{
			return arr1;
		}
		int size=(arr1.length>=arr2.length)?arr1.length+1:arr2.length+1;
		int[] res=new int[size];
		int carry=0;
		int sum=0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=res.length-1;
		while(i>=0 && j>=0)
		{
			sum=(arr1[i]+arr2[j])%10;
			res[k]=sum+carry;
			carry=(arr1[i]+arr2[j])/10;
			i--;
			j--;
			k--;
		}
		if(i>=0)
		{
			while(i>=0)
			{
				res[k]=arr1[i]+carry;
				i--;
				k--;
			}
		}
		else if(j>=0)
		{
			while(j>=0)
			{
				res[k]=arr2[j]+carry;
				j--;
				k--;
			}
		}
		else
		{
			res[k]=carry;
		}
		return res;
	}

	public static void main(String[] args)
	{
		int[] a1={8,5,2};
		int[] a2={1,3};
		int[] res=findSum(a1,a2);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	
}
