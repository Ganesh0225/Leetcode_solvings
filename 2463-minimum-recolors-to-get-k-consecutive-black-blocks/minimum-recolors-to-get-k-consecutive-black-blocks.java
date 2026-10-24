class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0,r=k-1;
        int w=0,b=0;
        for(int i=l;i<=r;i++){
            char ch=blocks.charAt(i);
            if(ch=='W') w++;
            else b++;
        }
        int minOps=blocks.length();
        minOps=Math.min(minOps,w);
        while(r<blocks.length()-1){
            if(blocks.charAt(l)=='W') w--;
            l++;
            r++;
            if(blocks.charAt(r)=='W') w++;
            minOps=Math.min(minOps,w);
        }
        return minOps;
    }
}