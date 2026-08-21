class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int val:nums1) set1.add(val);
        for(int val:nums2) set2.add(val);
        List<Integer> ls=new ArrayList<>();
        for(int val:set2){
            if(set1.contains(val)){
                ls.add(val);
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}