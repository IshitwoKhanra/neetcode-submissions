class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            int profit=prices[i]-min;
            max=Math.max(max,profit);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
