class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
                if(count<=k) list.add(nums[i]);
            }else{
                i=j;
                count=1;
                list.add(nums[i]);
            }
        }
        int[] ans=new int[list.size()];
        for(i=0;i<ans.length;i++) ans[i]=list.get(i);
        return ans;
    }
}