package Practice_Strings;

import java.util.HashMap;

public class CompressString {

	public static String compressString(String str) {
		if (str == null) {
			return null;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		while (i < str.length()) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
			i++;
		}
		int j = 0;
		String res = "";
		while (j < str.length()) {
			int value = map.get(str.charAt(j));
			res = res + str.charAt(j) + value;
			j = j + value;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str="aaabbcdddd";
		String res=compressString(str);
		System.out.println(res);
	}

}
