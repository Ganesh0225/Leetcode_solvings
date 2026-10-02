class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=-1;
        for(int val:nums){
            if(val%2!=0) continue;
            map.put(val,map.getOrDefault(val,0)+1);
            int count=map.get(val);
            if(count>max){
                ans=val;
                max=count;
            }else if(count==max){
                ans=Math.min(ans,val);
            }
        }
        return ans;
    }
}