package Practice_Strings;

import java.util.ArrayList;

public class ReturnAllPalindromicSubstrings {
	
	public static ArrayList<String> allPalindromicSubstrings(String str)
	{
		if(str.length()==0)
		{
			return null;
		}
		ArrayList<String> res=new ArrayList<>();
		int k=0;
		int i=0,j=0;
		while(k<str.length())
		{
			i=k;
			j=k;
			while(i>=0 && j<str.length())
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					break;
				}
				res.add(str.substring(i,j+1));
				i--;
				j++;
			}
			k++;
		}
		i=0;
		j=1;
		while(j<str.length())
		{
		  while(i>=0 && j<str.length())
		  {
			if(str.charAt(i)!=str.charAt(j))
			{
				break;
			}
			res.add(str.substring(i,j+1));
			i--;
			j++;
		  }
		  j=j+1;
		  i=j-1;
		}
		return res;
	}
	
	public static void main(String[] args) {
	String str="abcbdcddc";
	ArrayList<String> res=allPalindromicSubstrings(str);
	for(String r:res)
	{
	  System.out.println(r);	
	}
  }

}
