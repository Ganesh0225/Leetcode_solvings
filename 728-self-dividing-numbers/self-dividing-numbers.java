class Solution {
    private boolean selfDivide(int num){
        int m=num;
        while(m>0){
            int x=m%10;
            if(x==0 || num%x!=0) return false;
            m/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean bool=selfDivide(i);
            if(bool) list.add(i);
        }
        return list;
        
    }
}