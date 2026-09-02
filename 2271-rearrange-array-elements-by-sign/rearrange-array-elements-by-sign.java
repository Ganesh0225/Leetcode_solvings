class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> posi=new ArrayList<>();
        List<Integer> negi=new ArrayList<>();
        for(int val:nums){
            if(val>0) posi.add(val);
            else negi.add(val);
        }
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            nums[i++]=posi.get(p++);
            nums[i]=negi.get(n++);
        }
        return nums;
    }
}