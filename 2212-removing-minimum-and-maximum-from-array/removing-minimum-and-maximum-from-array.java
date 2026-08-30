class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        int a=Math.min(minIndex,maxIndex);
        int b=Math.max(minIndex,maxIndex);
        int left=b+1;
        int right=n-a;
        int both=(a+1)+(n-b);
        return Math.min(both,Math.min(left,right));
    }
}