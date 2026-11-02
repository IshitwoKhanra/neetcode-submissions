class Solution {
    public int search(int[] nums, int target) {
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
            int x=binarySearch(nums,0,nums.length-1,target);
            return x;
        }
        else
        {
            int y=binarySearch(nums,0,idx-1,target);
            int z=binarySearch(nums,idx,nums.length-1,target);
            if(y!=-1)
                return y;
            else
                return z;
        }
    }
    private int binarySearch(int nums[],int s,int e,int target)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
}
