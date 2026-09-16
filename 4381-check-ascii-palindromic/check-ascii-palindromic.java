class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            int ascii=s.charAt(i);
            i++;
            String binary=Integer.toBinaryString(ascii);
            sb.append("0"+binary);
        }
        n=sb.length();
        for(i=0;i<=n/2;i++){
            if(sb.charAt(i)!=sb.charAt(n-i-1)) return false;
        }
        return true;
    }
}