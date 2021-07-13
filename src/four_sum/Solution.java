package four_sum;

/*
    Given an array nums of n integers,
    return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

    -    0 <= a, b, c, d < n
    -    a, b, c, and d are distinct.
    -    nums[a] + nums[b] + nums[c] + nums[d] == target

    You may return the answer in any order.

    https://leetcode.com/problems/4sum/
*/

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> quadruplets = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int m = k + 1; m < nums.length; m++) {
                        if (nums[i] + nums[j] + nums[k] + nums[m] == target) {
                            List<Integer> quadruplet = new ArrayList<>();
                            quadruplet.add(nums[i]);
                            quadruplet.add(nums[j]);
                            quadruplet.add(nums[k]);
                            quadruplet.add(nums[m]);
                            Collections.sort(quadruplet);
                            quadruplets.add(quadruplet);
                        }
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> item : quadruplets) {
            result.add(item);
        }
        return result;
    }
}
