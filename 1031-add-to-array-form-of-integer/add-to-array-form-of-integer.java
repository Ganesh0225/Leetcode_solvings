class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //to use addFirst() method we are using LinkedList<>() take O(n)
        //while using addFirst() in ArrayList<>() it takes O(n2) 
        List<Integer> list=new LinkedList<>();
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