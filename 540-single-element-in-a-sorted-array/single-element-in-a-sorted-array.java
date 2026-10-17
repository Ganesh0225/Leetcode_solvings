class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)==1) ans=key;
        }
        return ans;
    }
}