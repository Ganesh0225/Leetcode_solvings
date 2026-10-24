class Solution {
    public int[] leftRightDifference(int[] nums) {
        int tot=0;
        for(int val:nums) tot+=val;
        int left=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int right=tot-nums[i]-left;
            ans[i]=Math.abs(right-left);
            left+=nums[i];
        }
        return ans;
    }
}