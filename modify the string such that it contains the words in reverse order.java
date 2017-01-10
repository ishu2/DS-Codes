package Practice_Strings;

public class Question_5 {
	
	public static String modifyString(String str)
	{
	  int i=str.length()-1;
	  int j=str.length()-1;
	  String res="";
	  while(i>=0)
	  {
		  while(i>=0 && str.charAt(i)!=' ')
		  {
			  i--;
		  }
		  res=res+str.substring(i+1,j+1)+" ";
		  j=i-1;
		  i=i-1;
	  }
	  return res;
	}
	
	
	public static void main(String[] args) {
		String str="Welcome To Coding Ninjas";
		String res=modifyString(str);
		System.out.println(res);
	}

}
