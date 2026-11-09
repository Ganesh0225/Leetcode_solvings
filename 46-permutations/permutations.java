class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        f(nums,ans,new ArrayList<>(),set);
        return ans;
    }
    public void f(int[] nums,List<List<Integer>> ans,List<Integer> list,Set<Integer> set){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                list.add(nums[i]);
                set.add(nums[i]);
                f(nums,ans,list,set);
                list.remove(list.size()-1);
                set.remove(nums[i]);
            }
        }
    }
}