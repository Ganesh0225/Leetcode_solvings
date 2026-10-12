class Solution {
    public int getLucky(String s, int k) {
        String convert="";

        for(char ch:s.toCharArray()){
            convert=convert+(ch-'a'+1);
        }
        int sum=0;
        int res=0;
        while(k-->0){
            for(char ch:convert.toCharArray()){
                sum+=(ch-'0');
            }
            convert=Integer.toString(sum);
            res=sum;
            sum=0;
        }
        return res;
    }
}