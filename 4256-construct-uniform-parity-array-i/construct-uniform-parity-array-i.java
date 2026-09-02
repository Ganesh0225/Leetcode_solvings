class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd=false;
        boolean even=false;
        boolean dif=false;
        for(int val:nums1){
            if(val%2==0) even=true;
            else odd=true;
        }
        for(int i=0;i<nums1.length-1;i++){
            if(Math.abs(nums1[i]-nums1[i+1])%2!=0) dif=true;
        }
        if((even && !odd)||(!even && odd)) return true;
        else if(dif) return true;
        return false;
        
    }
}