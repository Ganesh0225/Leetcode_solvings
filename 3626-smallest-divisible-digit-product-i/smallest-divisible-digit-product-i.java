class Solution {
    public int smallestNumber(int n, int t) {
        // if(n<t) return t;
        // int m=n;
        // int prod=1;
        // while(n>0){
        //     int rem=n%10;
        //     prod*=rem;
        //     n/=10;
        // }
        // if(prod%t==0) return m;
        // int r=prod%t;
        // int min=Math.min(r,t-r);
        // if((m+min)%t==0) return m+min;
        // return m+r;
        int i=0;
        while(true){
            int m=n+i;
            int val=m;
            int prod=1;
            while(m>0){
                int rem=m%10;
                prod*=rem;
                m/=10;
            }
            if(prod%t==0) return val;
            i++;
        }
        //return t;
    }
}