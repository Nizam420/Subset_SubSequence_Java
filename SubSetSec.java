package subsetsubsequencestring;

import java.util.ArrayList;

public class SubSetSec {
	public static void main(String[] args) {
		subsec("", "abc");
//		System.out.println(subsec("", "ccca"));
	}
	
	static void subsec(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subsec(p + ch, up.substring(1));
		subsec(p, up.substring(1));
	}
	
	
	static ArrayList<String> subsecArr(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subsecArr(p + ch, up.substring(1));
		ArrayList<String> right = subsecArr(p, up.substring(1));
		
		left.addAll(right);
		return left;
	}
}
