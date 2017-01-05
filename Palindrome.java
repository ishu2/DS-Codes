package Practice_Strings;

public class Palindrome {
	
	public static boolean checkPalindrome(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return true;
		}
		if((str.charAt(0))!=(str.charAt(str.length()-1)))
		{
			return false;  
		}
		boolean res=checkPalindrome(str.substring(1,str.length()-1));
		return res;
	}
	
	public static void main(String[] args) {
		String str="radgdawr";
		boolean res=checkPalindrome(str);
	    System.out.println(res);
	}

}
