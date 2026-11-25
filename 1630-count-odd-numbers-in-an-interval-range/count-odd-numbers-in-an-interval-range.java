class Solution {
    public int countOdds(int low, int high) {
        // int count=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0) count++;
        // }
        // return count;
        int count=0;
        if(low%2!=0 && high%2!=0) count++;
        int range=high-low+1;
        count+=range/2;
        return count;
    }
}