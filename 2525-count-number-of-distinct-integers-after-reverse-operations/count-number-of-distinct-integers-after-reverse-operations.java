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
        int[] arr=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            set.add(arr[i]);
        }
        for(int i=n;i<arr.length;i++){
            arr[i]=reverse(nums[i-n]);
            set.add(arr[i]);
        }
        return set.size();
    }
}