class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        int m=num;
        while(m>0){
            int rem=m%10;
            if(rem%2==0) even.offer(rem);
            else odd.offer(rem);
            m/=10;
        }
        String s=String.valueOf(num);
        int ans=0;
        for(char ch:s.toCharArray()){
            if((ch-'0')%2==0) ans=ans*10+even.poll();
            else ans=ans*10+odd.poll();
        }
        return ans;
    }
}