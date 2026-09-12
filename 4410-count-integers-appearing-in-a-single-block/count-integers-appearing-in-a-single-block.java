class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1) return 1;
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]) list.add(nums[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:list){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int count=0;
        for(int key:map.keySet()){
            if(map.get(key)==1) count++;
        }
        return count;
    }
}