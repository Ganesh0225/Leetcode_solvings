class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        if(!s.startsWith(String.valueOf(x))){
            if(s.contains(String.valueOf(x))) return true;
        }
        return false;
    }
}