class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int[] arr=new int[n];
        int j=n-1;
        int i=0;
        int k=0;
        while(k<n){
            arr[k++]=nums[j--];
            if(k<n) arr[k++]=nums[i++];
        }
        long sum=0;
        for(i=0;i<n;i+=2){
            if(i+1<n) sum+=(arr[i]-arr[i+1]);
            else sum+=(arr[i]);
        }
        return sum;
    }
}