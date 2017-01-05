package Practice_Strings;

public class Sort012 {
	
	public static void sort(int[] arr)
	{
		if(arr.length==0)
		{
			return ;
		}
		int zero=0;
		int one=0;
		int two=arr.length-1;
		while(one<=two)
		{
			if(arr[one]==0)
			{
				int temp=arr[one];
				arr[one]=arr[zero];
				arr[zero]=temp;
				zero++;
				one++;
			}
			else if(arr[one]==2)
			{
				int temp=arr[one];
				arr[one]=arr[two];
				arr[two]=temp;
				two--;
			}
			else
			{
				one++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={0,1,2,0,2,0,1};
		sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
