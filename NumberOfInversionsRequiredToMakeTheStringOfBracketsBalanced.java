package Practice_Strings;

import java.util.Stack;

public class NumberOfInversionsRequiredToMakeTheStringOfBracketsBalanced {
	
	public static int inversionsRequired(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		if((str.length())%2!=0)
		{
			return -1;
		}
		Stack s=new Stack();
		int i=0;
		while(i<str.length())
		{
			char a=str.charAt(i);
			if(a=='{')
			{
				s.push(a);
			}
			else if(a=='}')
			{
				if(!(s.isEmpty()))
				{
				char x=(char) s.pop();
				if(x=='}')
				{
					s.push(a);
					s.push(x);
				}
				}
				else
				{
					s.push(a);
				}
			}
		  i++;
		}
		i=0;
		int j=0;
		int k=0;
		while(!(s.isEmpty()))
		{
		  char x=(char) s.pop();
		  if(x=='}')
		  {
			i=i+1;
		  }
		  else
		  {
			j=j+1;
		  }
		}
		if(i%2==0)
		{
			i=i/2;
		}
		else
		{
			i=i/2+1;
		}
		if(j%2==0)
		{
			j=j/2;
		}
		else
		{
			j=j/2+1;
		}
		k=i+j;
		return k;
	}
	
	public static void main(String args[])
	{
		String str="}{{{}}";
		int res=inversionsRequired(str);
		System.out.println("Number of inversions required to make the String of brackets balanced are:");
        if(res!=-1)
        {
		System.out.println(res); 
        }
        else
        {
        	System.out.println("..Not enough braces..");
        }
	}

}
