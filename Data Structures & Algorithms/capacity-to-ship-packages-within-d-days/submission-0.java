class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int num:weights)
        {
            left=Math.max(left,num);
            right+=num;
        }
        int res=right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(isValid(mid,weights,days))
            {
                res=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return res;
    }
    private boolean isValid(int capacity,int weights[],int days)
    {
        int day=1,currCap=capacity;
        for(int weight:weights)
        {
            if(currCap-weight<0)
            {
                day++;
                currCap=capacity;
            }
            currCap-=weight;
        }
        return day<=days;
    }
}