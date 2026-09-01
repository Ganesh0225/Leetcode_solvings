class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        char[] digits=String.valueOf(num).toCharArray();
        for(char ch:digits){
            int d=ch-'0';
            if(d%2==0) even.offer(d);
            else odd.offer(d);
        }
        int ans=0;
        for(char ch:digits){
            int d=ch-'0';
            if(d%2==0) ans=ans*10+even.poll();
            else ans=ans*10+odd.poll();
        }
        return ans;
    }
}