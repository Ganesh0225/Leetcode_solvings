class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0],min=Integer.MAX_VALUE;
        int n=nums.length;
        int[] mina=new int[n];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            mina[i]=min;
        }
        int res=n;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            int score=max-mina[i];
            if(score<=k){
                res=Math.min(res,i);
            }
        }
        if(res==n) return -1;
        return res;
    }
}