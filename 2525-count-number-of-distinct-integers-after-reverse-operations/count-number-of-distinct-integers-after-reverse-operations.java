class Solution {
    private int reverse(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            int val=reverse(nums[i]);
            set.add(val);
        }
        return set.size();
    }
}