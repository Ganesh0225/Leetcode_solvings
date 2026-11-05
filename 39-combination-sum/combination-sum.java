class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        f(0,target,ans,new ArrayList<>(),candidates);
        return ans;

    }

    private void f(int i,int t,List<List<Integer>> ans,List<Integer> list,int[] arr){
        if(i==arr.length){
            if(t==0) ans.add(new ArrayList<>(list));
            return;
        }
        if(arr[i]<=t){
            list.add(arr[i]);
            f(i,t-arr[i],ans,list,arr);
            list.remove(list.size()-1);
        }
        f(i+1,t,ans,list,arr);
    }
}