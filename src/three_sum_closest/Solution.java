package three_sum_closest;

/*
    Given an array nums of n integers and an integer target,
    find three integers in nums such that the sum is closest to target.
    Return the sum of the three integers.
    You may assume that each input would have exactly one solution.

    https://leetcode.com/problems/3sum-closest/
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int difference = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        return sum;
                    }
                    if (Math.abs(target - sum) < difference) {
                        difference = Math.abs(target - sum);
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
