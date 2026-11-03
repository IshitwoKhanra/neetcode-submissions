class TimeMap {
    Map<String,List<String[]>> hm;
    public TimeMap() {
        hm=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key))
        {
            hm.put(key,new ArrayList<>());
        }
        hm.get(key).add(new String[]{value,Integer.toString(timestamp)});
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key))
            return "";
        int s=0,e=hm.get(key).size()-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int storedTime=Integer.parseInt(hm.get(key).get(mid)[1]);
            if(storedTime <= timestamp)
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans==-1 ?"":hm.get(key).get(ans)[0];
    }
}
