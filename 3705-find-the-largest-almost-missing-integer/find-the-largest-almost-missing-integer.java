class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=-1;
        int n=nums.length;
        if(k==1){
            for(int key:map.keySet()){
                if(map.get(key)==1){
                    ans=Math.max(ans,key);
                }
            }
        }else if(k==n){
            for(int i=0;i<n;i++){
                ans=Math.max(ans,nums[i]);
            }
        }else{
            if(map.get(nums[0])==1){
                ans=Math.max(ans,nums[0]);
            }
            if(map.get(nums[n-1])==1){
                ans=Math.max(ans,nums[n-1]);
            }
        }
        return ans;
    }
}