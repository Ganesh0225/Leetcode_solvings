class Solution {
    private boolean selfDivide(int num){
        List<Integer> list=new ArrayList<>();
        int m=num;
        while(m>0){
            int x=m%10;
            list.add(x);
            m/=10;
        }
        if(list.contains(0)) return false;
        for(int val:list){
            if(num%val!=0) return false;
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