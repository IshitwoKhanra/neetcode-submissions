class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int idx=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            return binarySearch(nums,0,nums.length-1,target);
        }
        else
        {
            return binarySearch(nums,0,idx-1,target) || binarySearch(nums,idx,nums.length-1,target);
        }
    }
    private boolean binarySearch(int nums[],int s,int e,int target)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}