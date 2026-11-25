class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0,dsum=0;
        for(int val:nums){
            if(val<10) ssum+=val;
            else dsum+=val; 
        }
        if(ssum==dsum) return false;
        return true;
    }
}