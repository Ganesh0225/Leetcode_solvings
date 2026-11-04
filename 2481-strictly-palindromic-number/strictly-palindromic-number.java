class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String val=Integer.toString(n,i);
            int len=val.length();
            String s1=val.substring(0,len/2);
            String s2=val.substring(len/2,len);
            if(!s1.equals(s2)) return false;
        }
        return true;
    }
}