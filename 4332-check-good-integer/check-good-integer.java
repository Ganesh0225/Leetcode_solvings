class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0,ssum=0;
        while(n>0){
            int x=n%10;
            dsum+=x;
            ssum+=(x*x);
            n/=10;
        }
        return ssum-dsum>=50;
    }
}