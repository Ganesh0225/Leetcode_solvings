class Solution {
    public int sumBase(int n, int k) {
        String val=Integer.toString(n,k);
        int sum=0;
        for(char ch:val.toCharArray()){
            sum+=ch-'0';
        }
        return sum;
    }
}