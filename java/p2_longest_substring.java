/*
*    Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*    Title: Longest Substring Without Repeating Characters
*    Author: Kyungwoo Song
*    Date: 2018.02.18
*    Java Version : 1.8.0
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        		
	   	int max_length = 0;
	   	int len_substring;
	   	int sub_length;
	   	char ch;
	   	int start_idx;
		HashMap<Character, Integer> m = new HashMap();
		String current_substring = "";
		int n = s.length();
		for(int i=0; i<n; i++)
		{
			ch = s.charAt(i);
			if (!(m.containsKey(ch)))
			{
				current_substring = current_substring + ch;
				m.put(ch, i);
			}
			else
			{
				len_substring = current_substring.length();
				if (len_substring > max_length)
				{
					max_length = len_substring;
				}
				start_idx = current_substring.indexOf(ch);
				sub_length = current_substring.length();

				current_substring = current_substring.substring(start_idx+1, sub_length) + ch;
				m.put(ch, i);
			}
		}
		len_substring = current_substring.length();
		if (len_substring > max_length)
		{
			max_length = len_substring;
		}
		return max_length;

    }
}
