class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,r=0,maxlen=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r])>k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;  
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    //passed with 83ms
    // public int maxSubarrayLength(int[] nums, int k) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     int l=0,r=0,maxlen=0;
    //     while(r<nums.length){
    //         map.put(nums[r],map.getOrDefault(nums[r],0)+1);
    //         if(map.get(nums[r])<=k){
    //             maxlen=Math.max(maxlen,r-l+1);
    //         }
    //         while(map.get(nums[r])>k){
    //             map.put(nums[l],map.get(nums[l])-1);
    //             l++;
    //         }
    //         r++;
    //     }
    //     return maxlen;
    //}

    //got time limit exceed for this
    // public int maxSubarrayLength(int[] nums, int k) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     int l=0,r=0,maxlen=0;
    //     while(r<nums.length){
    //         map.put(nums[r],map.getOrDefault(nums[r],0)+1);
    //         if(isValid(map,k)){
    //             maxlen=Math.max(maxlen,r-l+1);
    //         }else{
    //             if(map.get(nums[l])>0) map.put(nums[l],map.get(nums[l])-1);
    //             else map.remove(nums[l]);
    //             l++;
    //         }
    //         r++;
    //     }
    //     return maxlen;
    // }
    // public boolean isValid(HashMap<Integer,Integer> map,int k){
    //     for(int val:map.values()){
    //         if(val>k) return false;
    //     }
    //     return true;
    // }
}