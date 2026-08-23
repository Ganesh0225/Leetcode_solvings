class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,prod=1;
        int m=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        int total=sum+prod;
        if(m%total==0) return true;
        return false;
    }
}