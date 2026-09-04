class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE,max=nums[0];
        int[] mina=new int[n];
        for(int i=n-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            mina[i]=min;
        }

        int score=0,ans=n;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            min=mina[i];
            score=max-min;
            if(score<=k){
                ans=Math.min(ans,i);
            }
        }
        if(ans==nums.length) return -1;
        return ans;
    }
}