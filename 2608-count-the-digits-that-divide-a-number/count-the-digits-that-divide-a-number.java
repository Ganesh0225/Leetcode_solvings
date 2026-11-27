class Solution {
    public int countDigits(int num) {
        List<Integer> list=new ArrayList<>();
        int m=num;
        while(m>0){
            int x=m%10;
            list.add(x);
            m/=10;
        }
        int count=0;
        for(int val:list){
            if(num%val==0) count++;
        }
        return count;
    }
}