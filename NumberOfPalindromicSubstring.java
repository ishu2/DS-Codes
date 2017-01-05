package Practice_Strings;

public class NumberOfPalindromicSubstring {
	
	
	public static int numberOfPalindromicSubstrings(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int count=0;
		int i=0;
		int j=0,k=0;
		while(k<str.length())
		{
			i=j=k;
			while(i>=0 && j<=str.length()-1)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					break;
				}
				count++;
				i--;
				j++;
			}
			k++;
		}
		i=0;
		j=1;
		while(j<str.length())
		{
			k=i;
			while(i>=0 && j<=str.length()-1)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					break;
				}
				count++;
				i--;
				j++;
			}
			i=k+1;
			j=i+1;
		}
		return count;
	}
	public static void main(String[] args) {
		String str="abcbddbc";
		int res=numberOfPalindromicSubstrings(str);
		System.out.println(res);
	}

}
