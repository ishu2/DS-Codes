
package Practice_Strings;

import java.util.Stack;

public class CheckBalancingOfBrackets {

	public static boolean areBracketsBalanced(String str)
	{
	if(str.length()%2!=0)
	{
	return false;
	}
	Stack s=new Stack();
	boolean res=true;
	for(int i=0;i<str.length();i++)
	{
	  if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
	   {
	     s.push(str.charAt(i));
	   }
	   else
	   {
	     char a=(char) s.pop();
	     if((str.charAt(i)=='}' && a=='{')  ||  (str.charAt(i)==')' && a=='(')  ||  (str.charAt(i)==']' && a=='['))
	     {
	      res=true;
	     }
	     else 
	     {
	      res=false;
	      break;
	     }
	    }
	}
	return res;
	}

	public static void main(String[] args)
	{
	    String str="([{}])";
	    boolean res=areBracketsBalanced(str);
	    System.out.println(res);
	}

}
