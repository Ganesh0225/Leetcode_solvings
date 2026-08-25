class Solution {
    public int maxDistinct(String s) {
        int[] alpha=new int[26];
        for(char ch:s.toCharArray()){
            alpha[ch-'a']++;
        }
        int count=0;
        for(int val:alpha){
            if(val>=1) count++;
        }
        return count;
    }
}