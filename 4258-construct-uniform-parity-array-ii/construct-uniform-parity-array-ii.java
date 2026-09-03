class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean even=false;
        boolean odd=false;
        boolean makeOdd=true;
        int minOdd=Integer.MAX_VALUE;
        for(int val:nums1){
            if(val%2==0) even=true;
            else odd=true;
            if(val%2!=0 && val<minOdd) minOdd=val;
        }
        for(int val:nums1){
            if(val%2==0){
                if(val<minOdd) makeOdd=false; 
            }
        }
        
        if((even && !odd)||(!even && odd)) return true;
        else if(makeOdd) return true;
        return false;
        
    }
}