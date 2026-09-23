class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int val:nums) total+=val;
        int target=total-x;
        if(target==0) return n;
        int l=0,r=0;
        long sum=0;
        int maxlen=-1;
        while(r<n){
            sum+=nums[r];
            while(sum>target && l<r){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        if(maxlen>0) return n-maxlen;
        return -1;
    }
}