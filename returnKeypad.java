package Practice_Strings;

public class returnKeypad {
	
	public static String[] returnKeypads(int num)
	{
		if(num<10)
		{
		  String[] res=keypad(num);
		  return res;
		}
		String[] res=returnKeypads(num/10);
		int n=num%10;
		int k=0;
		String[] res2=keypad(n);
		String[] finalRes=new String[(res.length)*(res2.length)];
		for(int i=0;i<res.length;i++)
		{
		 for(int j=0;j<res2.length;j++)
		 {
		  finalRes[k]=res[i]+res2[j];
		  k++;
		 }
		}
		return finalRes;
	}
	
	public static String[] keypad(int num)
	{
		String[] result=null;
		switch(num)
		{
		case 0:String[] res0={" "};
		          result=res0;
		          break;
		case 1:String[] res={"#","@","&"};
		          result=res;
		          break;
		case 2:String[] res1={"a","b","c"};
		          result=res1;
		          break;
		case 3:String[] res2={"d","e","f"};
		          result=res2;
		          break;
		case 4:String[] res3={"g","h","i"};
		          result=res3;
		          break;
		case 5:String[] res4={"j","k","l"};
		          result=res4;
		          break;
		case 6:String[] res5={"m","n","o"};
		          result=res5;
		          break;
		case 7:String[] res6={"p","q","r","s"};
		          result=res6;
		          break;
		case 8:String[] res7={"t","u","v"};
		          result=res7;
		          break;
		case 9:String[] res8={"w","x","y","z"};
		          result=res8;
		          break;
		}
		return result;
	}

	public static void main(String[] args)
	{
		int num=62;
		String[] res=returnKeypads(num);
		for(String r:res)
		{
			System.out.println(r);
		}
	}
}
