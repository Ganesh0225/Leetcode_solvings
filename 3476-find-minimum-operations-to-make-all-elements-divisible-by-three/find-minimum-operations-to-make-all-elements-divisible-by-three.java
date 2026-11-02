class Solution {
    public int minimumOperations(int[] nums) {
        int moves=0;
        for(int val:nums){
            if(val%3!=0){
                int x=val%3;
                moves+=Math.min(x,3-x);
            }
        }
        return moves;
    }
}