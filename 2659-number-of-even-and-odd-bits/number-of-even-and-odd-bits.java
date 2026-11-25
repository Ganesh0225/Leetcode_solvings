class Solution {
    public int[] evenOddBit(int n) {
        String binary=Integer.toBinaryString(n);
        int even=0,odd=0;
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(binary.length()-i-1);
            if(i%2==0 && ch=='1') even++;
            else if(i%2!=0 && ch=='1') odd++;
        }
        return new int[]{even,odd};
    }
}