class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while(i>=0 || k>0){
            int sum=carry;
            if(i>=0){
                sum+=num[i];
                i--;
            }
            if(k>0){
                sum+=k%10;
                k/=10;
            }
            list.addFirst(sum%10);
            carry=sum/10;
        }
        if(carry>0) list.addFirst(carry);
        //Collections.reverse(list);
        return list;
    }
}