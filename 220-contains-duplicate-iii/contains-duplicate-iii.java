class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            long val = nums[i];
            
            // Find the smallest element in the window >= val - valueDiff
            Long ceiling = set.ceiling(val - valueDiff);
            if (ceiling != null && ceiling <= val + valueDiff) {
                return true;
            }
            
            // Add current number to the window
            set.add(val);
            
            // Slide window: remove elements older than indexDiff steps
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
        // int n=nums.length;
        // int l=0,r=1;
        // while(r<n){
        //     int idiff=r-l;
        //     if(idiff<=indexDiff){
        //         int vdiff=Math.abs(nums[r]-nums[l]);
        //         if(vdiff<=valueDiff){
        //             return true;
        //         }
        //     }else{
        //         l++;
        //         r=l+1;
        //         continue;
        //     }
        //     r++;
        // }
        // l++;
        // r=l+1;
        // while(l<n && r<n){
        //     int idiff=r-l;
        //     if(idiff<=indexDiff && l!=r){
        //         int vdiff=Math.abs(nums[r]-nums[l]);
        //         if(vdiff<=valueDiff){
        //             return true;
        //         }
        //     }else{
        //         l++;
        //         r=l+1;
        //         continue;
        //     }
        //     r++;
        // }
        
        // return false;
        
    }
}