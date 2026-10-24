class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int[] unique=new int[n];
        int[] ans=new int[n];
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int i=n-1;i>=0;i--){
            unique[i]=count;
            set.add(nums[i]);
            count=set.size();
        }
        count=0;
        set.clear();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            count=set.size();
            ans[i]=count-unique[i];
        }
        return ans;
    }
}