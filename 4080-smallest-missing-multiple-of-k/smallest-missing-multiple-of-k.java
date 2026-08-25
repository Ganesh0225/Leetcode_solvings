class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=1;
        while(i<=nums.length){
            int target=k*i;
            boolean found=false;
            for(int val:nums){
                if(val==target){
                    found=true;
                    break;
                }
            }
            if(!found) return target;
            i++;
        }
        return k*(i);
    }
}