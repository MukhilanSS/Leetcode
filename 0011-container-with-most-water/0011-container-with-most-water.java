class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1,left=0,maxWater=0,minheight=100;
        while(left<right)
        {
            minheight=Math.min(height[left],height[right]);
            maxWater=Math.max(maxWater,(right-left)*minheight);
            while(left<right && height[left]<=minheight) left++;
            while(left<right && height[right]<=minheight) right--;
            
        }
        return maxWater;
    }
}