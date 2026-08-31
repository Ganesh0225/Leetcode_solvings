class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        while(set.contains(original)){
            original*=2;
        }
        return original;
        // int i=0;
        // while(i<nums.length){
        //     if(nums[i]==original){
        //         original*=2;
        //         i=0;
        //     }
        //     else i++;
        // }
        // return original;
    }
}