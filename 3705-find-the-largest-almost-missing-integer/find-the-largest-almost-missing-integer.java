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
            if(map.get(nums[0])==1 && map.get(nums[n-1])==1){
                ans=Math.max(nums[0],nums[n-1]);
            }else if(map.get(nums[0])!=1 && map.get(nums[n-1])==1){
                ans=nums[n-1];
            }else if(map.get(nums[0])==1 && map.get(nums[n-1])!=1){
                ans=nums[0];
            }
        }
        return ans;
    }
}