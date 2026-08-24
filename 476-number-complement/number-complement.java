class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        StringBuilder ans=new StringBuilder(binary);
        for(int i=0;i<ans.length();i++){
            char ch=ans.charAt(i);
            if(ch=='0') ans.setCharAt(i,'1');
            else ans.setCharAt(i,'0');
        }
        int result=Integer.parseInt(ans.toString(),2);
        return result;
    }
}