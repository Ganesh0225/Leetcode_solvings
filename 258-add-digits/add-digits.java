class Solution {
    public int addDigits(int num) {
        int sum=0;
        int m=num;
        //System.out.println(3/10);
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
            if(sum<10 && num==0) break;
            if(num==0){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}