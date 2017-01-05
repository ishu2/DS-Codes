package Practice_Strings;

public class returnSubsetsOfArray {
	
	public static int recursion(int i)
	{
		if(i==0 || i==1 || i==2)
		{
			return i;
		}
		int res=recursion(i)+recursion(i-1)+recursion(i-2);
		return res;
	}
	
	public static int[][] returnSubsets(int[] arr)
	{
		if(arr.length==0)
		{
			int[][] res={{ }};
			return res;
		}
		int[] newArr=new int[arr.length-1];
		for(int i=0;i<newArr.length;i++)
		{
			newArr[i]=arr[i+1];
		}
		int[][] res=returnSubsets(newArr);
		int[][] finalRes=new int[(res.length)*2][];
		for(int i=0;i<res.length;i++)
		{
			int l=res[i].length;
			finalRes[i]=new int[l];
			for(int j=0;j<l;j++)
			{
				finalRes[i][j]=res[i][j];
			}
		}
		for(int i=0;i<res.length;i++)
		{
			int l=res[i].length+1;
			finalRes[i+res.length]=new int[l];
			finalRes[res.length+i][0]=arr[0];
			for(int j=0;j<l-1;j++)
			{
				finalRes[res.length+i][j+1]=res[i][j];
			}
		}
		return finalRes;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3};
		int[][] res=returnSubsets(arr);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		int[] res1=new int[res.length];
		for(int i=0;i<res.length;i++)
		{
		    res1[i]=0;
		}
		for(int i=0;i<res.length;i++)
		{
		    for(int j=0;j<res[i].length;j++)
		    {
		        res1[i]=res1[i]+res[i][j];
		    }
		}
		int[] asd=new int[res.length];
		for(int i=0;i<asd.length;i++)
		{
			asd[i]=recursion(res1[i]);
		}
		int Q=0;
		for(int i=0;i<asd.length;i++)
		{
			Q=Q+asd[i];
		}
		int num=(int) Math.pow(10,9);
		int S=(Q)%(num+7);
		System.out.println(S);

	}

}
