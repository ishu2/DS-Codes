package Practice_Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class Question_2 {
	
	public static char highestOccuring(String str)
	{
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int i=0;
		while(i<str.length())
		{
			if(map.containsKey(str.charAt(i)))
			{
				int val=map.get(str.charAt(i));
				map.put(str.charAt(i),val+1);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
		}
		int freq=-1;
		Character r=' ';
		ArrayList<Character> a=(ArrayList<Character>) map.keySet();
		for(Character str1:a)
		{
			int value=map.get(str1);
			Character res=str1;
			if(value>=freq)
			{
				freq=value;
				r=res;
			}
		}
		return r;
	}

	
	
	public static void main(String[] args)
	{
		String str="abcccbbafcaggdcd";
		char res=highestOccuring(str);
		System.out.println(res);
	}

}
