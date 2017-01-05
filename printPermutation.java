package Practice_Strings;

public class printPermutation {
	
	public static void printPermutations(String str,String resultSoFar)
	{
		if(str.length()==0)
		{
		 	System.out.println(resultSoFar);
		 	return;
		}
		for(int i=0;i<str.length();i++)
		{
			printPermutations(str.substring(0,i)+str.substring(i+1),resultSoFar+str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String str="933";
		printPermutations(str,"");
	}

}

