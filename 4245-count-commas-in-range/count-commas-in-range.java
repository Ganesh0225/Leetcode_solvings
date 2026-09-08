class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int commas=0;
        if(n>=1000 && n<99999){
            commas+=n-999;
        }else if(n>10000 && n<=100000){
            commas+=n-999;
        }
        return commas;
    }
}