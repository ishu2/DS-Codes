package Practice_Strings;

public class Question_4 {
	
/*	public static String reverseWords(String str)
	{
		String res="";
		int i=0,j=0,k=0;
		while(i<str.length()-1)
		{
			j=k;
			while(str.charAt(i)!=' ' || i<str.length()-1)
			{
				i++;
			}
			k=i;
			while(i>=j)
			{
				res=res+str.charAt(i);
				i--;
			}
			i=k;
			while(str.charAt(i)==' ')
			{
				i++;
			}
		}
		return res;
	}
*/ 
	
	public static String reverseWords(String str)
	{
		String res="";
		int i=0,j=0,k=0;
		while(i<str.length()-1)
		{
			j=i;
			while(str.charAt(i)!=' ' && i<str.length()-1)
			{
				i++;
			}
			res=res+reverse(str.substring(j,i))+" ";
			i++;
		}
		return res;
	}

	
	public static String reverse(String str)
	{
		if(str.length()==0)
		{
			String res="";
			return res;
		}
		String res=reverse(str.substring(1,str.length()));
	    res=res+str.charAt(0);
	    return res;
	}

	public static void main(String[] args) {
		String str="Welcome To Coding Ninjas";
		String res=reverseWords(str);
		System.out.println(res);
	}
}
