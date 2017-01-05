package Practice_Strings;

public class returnPermutations {
	
	public static String[] returnPermutations(String str)
	{
		if(str.length()==1)
		{
			String[] res={str};
			return res;
		}
		String[] res=returnPermutations(str.substring(1));
		int size=(res.length)*(res[0].length()+1);
		String[] finalRes=new String[size];
        int k=0;
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<=res[i].length();j++)
			{
				finalRes[k]=res[i].substring(0,j)+str.charAt(0)+res[i].substring(j);
				k++;
			}
		}
		return finalRes;
	}
	
	public static void main(String[] args) {
		String str="abc";
		String[] res=returnPermutations(str);
		for(String r:res)
		{
			System.out.println(r);
		}
	}

}
