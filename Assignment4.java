package Array;

import java.util.ArrayList;

public class Assignment4 {
	public static void findDuplicate(String s) {
		char[] carr = s.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<carr.length;i++) {
			//To handle case-sensetivity converting all the characters to lower case
			carr[i]=Character.toLowerCase(carr[i]); 	 
												
			if(!list.contains(carr[i])){
				list.add(carr[i]);
			}else {
				System.out.println(carr[i]);
				
			}
		}
	}
	public static void main(String[] args) {
		String s ="Aapple";
		findDuplicate(s);
	}
}
