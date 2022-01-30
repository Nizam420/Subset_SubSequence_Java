package subsetsubsequencestring;

import java.util.ArrayList;

public class Ascii {
	public static void main(String[] args) {
		subsecAscii1("", "abc");
		System.out.println(subsecAscii("", "abc"));
	}
	
	static void subsecAscii1(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		subsecAscii1(p + ch, up.substring(1));
		subsecAscii1(p, up.substring(1));
		subsecAscii1(p + (ch + 0), up.substring(1));
	}
	
	static ArrayList<String> subsecAscii(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		ArrayList<String> left = subsecAscii(p + ch, up.substring(1));
		ArrayList<String> right = subsecAscii(p, up.substring(1));
		ArrayList<String> both = subsecAscii(p + (ch + 0), up.substring(1));
		
		left.addAll(right);
		left.addAll(both);
		return left;
	}
}
