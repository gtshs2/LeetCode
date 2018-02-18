/*
*    Problem: https://leetcode.com/problems/two-sum/description/
*    Title: Two Sum
*    Author: Kyungwoo Song
*    Date: 2018.02.17
*    Java Version : 1.8.0
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap();
		int n = nums.length;
		for(int i=0; i<n; i++)
		{
			int num = nums[i];
			m.put(num, i);
		}
		

		for(int i=0; i<n; i++)
		{
			int num = nums[i];
			int candidate = target - num;
			
			if ( (m.containsKey(candidate)) && (m.get(candidate) > i) )
			{
				return new int[] {i, m.get(candidate)};
			}
		}
		return null;
        
        
        
    }
}
