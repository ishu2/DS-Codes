package Practice_Strings;
import java.util.ArrayList;

public class DecimalToBinaryUsingArray {
	
	public static int[] binaryConversion(int num)
	{
		ArrayList<Integer> res=new ArrayList<>();
		while(num>0)
		{
			res.add(num%2);
			num=num/2;
		}
		int size=res.size();
		int[] result=new int[size];
		int k=0;
		for(int i:res)
		{
			result[k]=i;
			k++;
		}
		int start=0;
		int end=result.length-1;
		while(start<end)
		{
			int temp=result[start];
			result[start]=result[end];
			result[end]=temp;
			start++;
			end--;
		}
		return result;
	}

	public static void main(String[] args)
	{
		int decimal=12;
		int[] res=binaryConversion(decimal);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}
	}
	
}
