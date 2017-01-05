package Practice_Strings;

public class returnSubsequences {
	
	public static String[] findSubsequences(String str)
	{
		if(str.length()==0)
		{
			String[] res={""};
			return res;
		}
		String[] res=findSubsequences(str.substring(1));
		String[] finalRes=new String[res.length*2];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			finalRes[k]=res[i];
			k++;
		}
		for(int i=0;i<res.length;i++)
		{
			finalRes[k]=str.charAt(0)+res[i];
			k++;
		}
		return finalRes;
	}
	
	public static void main(String[] args) {
		String str="abc";
		String[] arr=findSubsequences(str);
		for(String i:arr)
		{
			System.out.println(i);
		}
	}

}
