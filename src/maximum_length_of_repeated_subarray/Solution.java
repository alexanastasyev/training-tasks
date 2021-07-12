package maximum_length_of_repeated_subarray;

/*
    Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.

    https://leetcode.com/problems/maximum-length-of-repeated-subarray/
*/

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((nums1.length - i + 1) < maxSum) {
                break;
            }
            for (int j = 0; j < nums2.length; j++) {
                if ((nums2.length - j + 1) < maxSum) {
                    break;
                }
                if (nums1[i] == nums2[j]) {
                    int firstIndex = i;
                    int secondIndex = j;
                    while (secondIndex < nums2.length && firstIndex < nums1.length && nums1[firstIndex] == nums2[secondIndex]) {
                        currentSum++;
                        firstIndex++;
                        secondIndex++;
                    }
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                    currentSum = 0;
                }
            }
        }
        return maxSum;
    }
}
