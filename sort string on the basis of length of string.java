package Practice_Strings;

public class Question_3 {
	
	public static String[] sort1(String[] str)
	{
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=0;j<str.length-i-1;j++)
			{
				if(str[j].length()>str[j+1].length())
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		return str;
	}
	
	public static String[] sort2(String[] arr)
	{
	   for(int i=0;i<arr.length-1;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i].length()>arr[j].length())
			   {
				   String temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   return arr;
	}
	
	public static String[] sort3(String[] arr)
	{
		int j=1;
		int i=j-1;
		while(j<arr.length)
		{
	     String temp=arr[j];
	     i=j-1;
		 while(i>=0 && arr[i].length()>temp.length())
		 {
				arr[i+1]=arr[i]; 
                i--;			 
		 }
		 arr[i+1]=temp;
		 j++;
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] arr={"cccbhyjmg","jfsi","xbq","utdtc"};
		String[] res=sort3(arr);
		for(String r:res)
		{
			System.out.println(r);
		}
	}
}
