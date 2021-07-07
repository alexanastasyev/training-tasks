package container_with_most_water;

/*
    Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
    n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0).
    Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

    Notice that you may not slant the container.
 */

class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int maxArea = Math.min(height[0], height[length - 1]) * (length - 1);
        int lastEndHeight = height[length - 1];
        for (int i = length - 1; i > 0; i--) {
            if (height[i] > lastEndHeight) {
                lastEndHeight = height[i];
                int currentArea = Math.min(height[0], height[i]) * i;
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        int lastStartHeight = height[0];
        for (int i = 1; i < length - 1; i++) {
            if (height[i] > lastStartHeight) {
                lastStartHeight = height[i];
                lastEndHeight = height[length - 1];
                int currentArea = Math.min(height[i], height[length - 1]) * ((length - 1) - i);
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
                for (int j = length - 2; j > i; j--) {
                    if (height[j] > lastEndHeight) {
                        lastEndHeight = height[j];
                        currentArea = Math.min(height[i], height[j]) * (j - i);
                        if (currentArea > maxArea) {
                            maxArea = currentArea;
                        }
                    }
                }
            }
        }
        return maxArea;
    }
}
