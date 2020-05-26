package ttest;

import java.util.*;

public class ConvertCollection {
	public static void main(String[]args) {
		List<String> lst = Arrays.asList("Box","Toy","Box","Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		
		for(String s : list)
			System.out.print(s.toString()+'\t');
		System.out.println();
		
		HashSet<String> set = new HashSet<>(list);
		
		list = new ArrayList<>(set);
		
		for (String s : list)
			System.out.print(s.toString()+'\t');
		System.out.println();
	}
}
