class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int val:nums1) set1.add(val);
        for(int val:nums2) set2.add(val);
        int ans1=0,ans2=0;
        for(int val:nums1){
            if(set2.contains(val)) ans1++;
        }
        for(int val:nums2){
            if(set1.contains(val)) ans2++;
        }

        return new int[]{ans1,ans2};
    }
}