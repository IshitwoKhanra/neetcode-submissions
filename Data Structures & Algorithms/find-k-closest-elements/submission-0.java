class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>();
        for(int num:arr)
        {
            list.add(num);
        }
        Collections.sort(list,(a,b)->{
            int diff= Math.abs(a-x)-Math.abs(b-x);
            return diff==0 ? Integer.compare(a,b) : diff;
        });
        List<Integer> ans=list.subList(0,k);
        Collections.sort(ans);
        return ans;
    }
}