package Practice_Strings;

public class Question_1 {
	
	public static String compressString(String str)
	{
		int i=0;
		String res="";
		while(i<str.length()-1)
		{
			if((str.charAt(i))==(str.charAt(i+1)))
			{
				i=i+1;
			}
			else
			{
				res=res+str.charAt(i);
				i=i+1;
			}
		}
		if(str.charAt(i)==res.charAt(res.length()-1))
		{
			return res;
		}
		else
		{
			res=res+str.charAt(i);
			return res;
		}
	}
	public static void main(String[] args) {
		String str="aabcba";
		String result=compressString(str);
		System.out.println(result);
	}

}
