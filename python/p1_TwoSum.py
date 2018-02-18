'''
*    Problem: https://leetcode.com/problems/two-sum/description/
*    Title: Two Sum
*    Author: Kyungwoo Song
*    Date: 2018.02.17
*    Python Version : 3.6
'''

class Solution:
    def twoSum(self, nums, target):
        num_itr_dict = dict()
        for itr in range(len(nums)):
            num = nums[itr]
            num_itr_dict[num] = itr

        for itr in range(len(nums)):
            num = nums[itr]
            candidate = target - num
            if (candidate in num_itr_dict) and (num_itr_dict[candidate]>itr):
                return [itr,num_itr_dict[candidate]]
