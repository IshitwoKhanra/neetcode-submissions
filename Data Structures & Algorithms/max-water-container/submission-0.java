class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            int area=(right-left)*Math.min(heights[left],heights[right]);
            max=Math.max(max,area);
            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
