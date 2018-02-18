/*
*    Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*    Title: Longest Substring Without Repeating Characters
*    Author: Kyungwoo Song
*    Date: 2018.02.18
*    Compiler Version : g++ 6.3.0 (C++14)
*/
class Solution {
public:
int lengthOfLongestSubstring(string s) {
    //vector<int> length_vector;
    int max_length = 0;
    int len_substring;
    unordered_map <char,int> m;
    string current_substring = "";

    int n = s.length();
    for (int i=0; i<n; i++)
    {
        char ch = s[i];
        auto it = m.find(ch);
        if (it == m.end())
        {
            current_substring = current_substring + ch;
            m[ch] = i;
        }
        else
        {
            len_substring = current_substring.length();
            if (len_substring > max_length)
            {
                max_length = len_substring;
            }
            int start_idx = current_substring.find(ch);
            current_substring = current_substring.substr(start_idx+1,i) + ch;
            m[ch] = i;
        }
    }
    len_substring = current_substring.length();
    if (len_substring > max_length)
    {
        max_length = len_substring;
    }
    return max_length;
}
};
