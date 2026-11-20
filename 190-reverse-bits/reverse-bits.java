class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s",
                Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb=new StringBuilder(binary);
        sb.reverse();
        int result=Integer.parseInt(sb.toString(),2);
        return result;
    }
}