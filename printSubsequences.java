package Practice_Strings;

public class printSubsequences {
	
	public static void findSubsequences(String str,String resultSoFar)
	{
		if(str.length()==0)
		{
			System.out.println(resultSoFar);
			return;
		}
			findSubsequences(str.substring(1),resultSoFar);
			findSubsequences(str.substring(1),resultSoFar+str.charAt(0));
	}

	public static void main(String[] args) {
		String str="abc";
		findSubsequences(str," ");
	}
}
