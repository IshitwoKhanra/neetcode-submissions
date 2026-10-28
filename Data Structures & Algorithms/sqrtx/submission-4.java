class Solution {
    public int mySqrt(int x) {
        if(x<2)
            return x;
        int left=0,right=x/2,ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long res=(long)mid*mid;
            if(res==x)
            {
                return (int)mid;
            }
            else if(res>x)
            {
                right=(int)mid-1;
            }
            else
            {
                ans=(int)mid;
                left=(int)mid+1;
            }
        }
        return ans;
    }
}