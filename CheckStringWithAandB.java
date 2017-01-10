package Practice_Strings;

public class CheckStringWithAandB {

	public static boolean checkStringWithAandB(String str) 
	{
		if (str.length() == 0)
		{
			return true;
		}
		if (str.length() == 1)
		{
			if (str.charAt(0) == 'a')
			{
				return true;
			} else
			{
				return false;
			}
		}
		boolean res = false;
		if (str.charAt(0) == 'a')
		{
			if (str.charAt(1) == 'a')
			{
				res = checkStringWithAandB(str.substring(1));
			}
			else if(str.length()>=3)
			{
			if(str.charAt(1) == 'b' && str.charAt(2) == 'b')
			{
				res = checkStringWithAandB(str.substring(3));
			}
			else
			{
				return false;
			}
			}
			else
			{
				return false;
			}
		}
		return res;
	}

	public static void main(String args[])
	{
		String str="aabb";
		boolean res=checkStringWithAandB(str);
		System.out.println(res);
	}

}
