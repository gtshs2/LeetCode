/*
*    Problem: https://leetcode.com/problems/two-sum/description/
*    Title: Two Sum
*    Author: Kyungwoo Song
*    Date: 2018.02.17
*    Compiler Version : g++ 6.3.0 (C++14)
*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map <int,int> m;

    int n = nums.size();
    for (int i=0; i<n; i++)
    {
        int num = nums[i];
        m[num] = i;
    }
    for (int i=0; i<n; i++)
    {
        int num = nums[i];
        int candidate = target - num;
        auto it = m.find(candidate);
        if ((it != m.end()) && (it->second > i))
        {
            return {i,it->second};
        }
    }
    }
};
