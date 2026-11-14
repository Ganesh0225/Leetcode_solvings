class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int range=r-l;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int size=0,sum=0;
            for(int j=i;j<nums.size();j++){
                size++;
                sum+=nums.get(j);
                if(size>=l && size<=r){
                    if(sum>0) min=Math.min(min,sum);
                }

            }
        }
        if(min>0 && min!=Integer.MAX_VALUE) return min;
        return -1;
    }
}