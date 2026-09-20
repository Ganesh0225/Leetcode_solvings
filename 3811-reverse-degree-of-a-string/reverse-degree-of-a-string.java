class Solution {
    public int reverseDegree(String s) {
        // char ch='z';
        // System.out.println('z'-(int)ch+1);
        int val=0;
        int i=1;
        for(char ch:s.toCharArray()){
            int revdegree='z'-ch+1;
            val+=revdegree*i;
            i++;
        }
        return val;
    }
}