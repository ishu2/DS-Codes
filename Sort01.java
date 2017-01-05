package Practice_Strings;

public class Sort01 {
	
	public static void sort(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return;
		}
		int i=0;
		int k=0;
		while(i<arr.length)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
			i++;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,0,1,0,1,0,1,0};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
