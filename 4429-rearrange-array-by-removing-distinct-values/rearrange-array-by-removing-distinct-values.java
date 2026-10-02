class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] freq=new int[101];
        for(int val:nums) freq[val]++;
        int index=0;
        while(index<n){
            for(int i=1;i<101;i++){
                if(freq[i]>0){
                    ans[index++]=i;
                    freq[i]--;
                }
            }
        }
        return ans;
    }
}