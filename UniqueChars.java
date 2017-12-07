/*
  Implement an algorithm to determine if a string has all unique characters.
  What if you can not use additional data structures?
*/

public class UniqueChars {
	public static boolean isUniqueChars(String s) {
		// Assume only ASCII chars in the string
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < s.length(); i++){
			int val = (int) s.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "abcabc";
		String s2 = "abcdefg";
		System.out.println(s1 + " has unique characters: " + UniqueChars.isUniqueChars(s1));
		System.out.println(s2 + " has unique characters: " + UniqueChars.isUniqueChars(s2));
	}
}
