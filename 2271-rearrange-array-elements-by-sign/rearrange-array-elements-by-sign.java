class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int posi=0;
        int negi=1;
        for(int val:nums){
            if(val>0){
                res[posi]=val;
                posi+=2;
            }
            else{
                res[negi]=val;
                negi+=2;
            }
        }
        return res;

        // List<Integer> posi=new ArrayList<>();
        // List<Integer> negi=new ArrayList<>();
        // for(int val:nums){
        //     if(val>0) posi.add(val);
        //     else negi.add(val);
        // }
        // int p=0,n=0;
        // for(int i=0;i<nums.length;i++){
        //     nums[i++]=posi.get(p++);
        //     nums[i]=negi.get(n++);
        // }
        // return nums;
    }
}