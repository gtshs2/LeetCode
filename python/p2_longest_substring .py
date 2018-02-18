'''
*    Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*    Title: Longest Substring Without Repeating Characters
*    Author: Kyungwoo Song
*    Date: 2018.02.18
*    Python Version : 3.6
'''

class Solution:
    def lengthOfLongestSubstring(self, s):
        length_list = [0]
        char_dict = dict()
        current_substring = ""
        for itr in range(len(s)):
            char = s[itr]
            if not char in char_dict:
                current_substring = current_substring + char
                char_dict[char] = itr
            elif char in char_dict:
                len_substring = len(current_substring)
                length_list.append(len_substring)
                start_idx = current_substring.find(char)
                new_substring = current_substring[start_idx+1:itr] + char
                current_substring = new_substring
                char_dict[char] = itr
        length_list.append(len(current_substring))
        return max(length_list)
