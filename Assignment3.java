package Array;

import java.util.HashMap;

public class Assignment3 {
	public static void numberOfWords(String s) {
		//String[] arr= s.split(" ");
		int cnt = 1;
		HashMap<String,Integer> hm = new HashMap<>();
		for(String temp : s.split(" ")) {
			hm.put(temp, cnt);
			cnt++;
		}
		System.out.println(hm.size());
	}
	public static void main(String[] args) {
		String s = "Have a nice day!";
		numberOfWords(s);
	}
}
