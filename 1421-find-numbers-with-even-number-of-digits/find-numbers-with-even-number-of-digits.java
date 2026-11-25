class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int val:nums){
            int digits=0;
            while(val>0){
                digits++;
                val/=10;
            }
            if(digits%2==0) count++;
        }
        return count;
    }
}