class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0)
            return;
        int ans[]=new int[nums.length];
        k=k%nums.length;       
        if(k==0)
            return;

        for(int i=0;i<nums.length-k;i++)
        {
            ans[i+k]=nums[i];
        }
        for(int i=nums.length-k;i<nums.length;i++)
        {
            ans[i-(nums.length-k)]=nums[i];
        }
        for(int i=0;i<ans.length;i++)
        {
            nums[i]=ans[i];
        }
    }
}