class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length-1 && j<nums.length){
            if(nums[i]%2!=0){
                while(nums[j]%2!=0 && j<nums.length){
                    j+=2;
                }
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i+=2;
            }
            else i+=2;
        }
        return nums;
    }
}