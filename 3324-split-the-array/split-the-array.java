class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int max=nums[0];
        for(int val:nums){
            max=Math.max(max,val);
        }
        int[] freq=new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<=max;i++){
            if(freq[i]>2) return false;
        }
        return true;

        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int val:nums){
        //     map.put(val,map.getOrDefault(val,0)+1);
        // }
        // for(int val:map.values()){
        //     if(val>2) return false;
        // }
        // return true;
    }
}