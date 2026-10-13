class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>2) return false;
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