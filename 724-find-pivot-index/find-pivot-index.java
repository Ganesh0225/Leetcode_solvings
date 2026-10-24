class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0,left=0;
        for(int val:nums) tot+=val;
        for(int i=0;i<nums.length;i++){
            int right=tot-nums[i]-left;
            if(right==left) return i;
            left+=nums[i];
        }
        return -1;
    }
}