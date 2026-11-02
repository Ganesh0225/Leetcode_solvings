class Solution {
    public int minMoves2(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // int median=0;
        // if(n%2==0){
        //     median=(nums[n/2]+nums[(n/2)-1])/2;
        // }else median=nums[n/2];
        // int moves=0;
        // for(int val:nums){
        //     moves+=Math.abs(median-val);
        // }
        // return moves;

        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int moves=0;
        while(i<j){
            moves+=nums[j]-nums[i];
            i++;
            j--;
        }
        return moves;
    }
}