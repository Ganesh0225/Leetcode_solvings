class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        int i=0;
        while(i<nums.length-1){
            even.add(nums[i++]);
            odd.add(nums[i++]);
        } 
        if(nums.length%2!=0) even.add(nums[i]);
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
        int e=0,o=0;
        i=0;
        while(i<nums.length-1){
            nums[i++]=even.get(e++);
            nums[i++]=odd.get(o++);
        }
        if(nums.length%2!=0) nums[i]=even.get(e);
        return nums;
    }
}