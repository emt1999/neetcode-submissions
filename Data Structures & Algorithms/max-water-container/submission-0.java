class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int leftLength = heights[left];
        int rightLength = heights[right];
        int width = right-left;
        int maxWidth = width;
        int length = Math.min(leftLength,rightLength);
        int maxArea = length * width;

        while(left<right){
            leftLength = heights[left];
            rightLength = heights[right];
            width = right - left;
            length = Math.min(leftLength, rightLength);
            int area = length*width;
            if(area > maxArea){
                maxArea = area;
            }
            if(leftLength > rightLength){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }
}
