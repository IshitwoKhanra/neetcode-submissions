class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=0;
        for(int pile:piles)
        {
            right=Math.max(right,pile);
        }
        int mid=0;
        while(left<right)
        {
            mid=left+(right-left)/2;
            int hours=0;
            for(int x:piles)
            {
                hours+=Math.ceil((double)x/mid);
            }
            if(hours<=h)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}
