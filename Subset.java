package subsetsubsequencestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
		List<List<Integer>> ans= subsetDup(arr);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
	}
	
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		for (int num : arr) {
			int n = outer.size();
			for (int i = 0; i < n; i++) {
				List<Integer> internel = new ArrayList<>(outer.get(i));
				internel.add(num);
				outer.add(internel);
			}
		}
		return outer;
	}
	
	static List<List<Integer>> subsetDup(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < arr.length; i++) {
			start = 0;
			if (i > 0 && arr[i] == arr[i - 1]) {
				start = end + 1;
			}
			end = outer.size() - 1;
			int n = outer.size();
			for (int j = start; j < n; j++) {
				List<Integer> internel = new ArrayList<>(outer.get(j));
				internel.add(arr[i]);
				outer.add(internel);
			}
		}
		return outer;
	}
}
