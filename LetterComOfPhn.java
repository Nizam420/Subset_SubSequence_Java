package subsetsubsequencestring;

import java.util.ArrayList;

public class LetterComOfPhn {
	public static void main(String[] args) {
		add("", "23");
		System.out.println(addRet("", "23"));
		
	}
	
	static void add(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit = up.charAt(0) - '0';
		
		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char)('a' + i);
			
			add(p + ch, up.substring(1));
		}
	}
	
	static ArrayList<String> addRet(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0';
		
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char)('a' + i);
			
			list.addAll(addRet(p + ch, up.substring(1)));
		}
		return list;
	}
}
