class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int area = (right - left) * (Math.min(leftHeight, rightHeight));
            if (area > maxArea) {
                maxArea = area;
            }
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
