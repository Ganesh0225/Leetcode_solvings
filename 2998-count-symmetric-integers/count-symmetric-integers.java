class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String sb=String.valueOf(i);
            if(sb.length()%2==0){
                int left=0,right=0;
                for(int j=0;j<sb.length()/2;j++){
                    char ch=sb.charAt(j);
                    left+=ch-'0';
                }
                for(int j=sb.length()/2;j<sb.length();j++){
                    char ch=sb.charAt(j);
                    right+=ch-'0';
                }
                if(left==right) count++;
            }
        }
        return count;
    }
}