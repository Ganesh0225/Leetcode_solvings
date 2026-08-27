class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int l=0,r=0,minlen=101,len=0;
        int oneCount=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ch=='1') oneCount++;
            while(oneCount>k || (oneCount==k && s.charAt(l)=='0')){
                char c=s.charAt(l);
                if(oneCount>k){
                    if(c=='1') oneCount--;
                    l++;
                }else{
                    l++;
                    len=r-l+1;
                    if(len<minlen){
                        ans=new StringBuilder(s.substring(l,r+1));
                        minlen=len;
                    }
                    if(len==minlen){
                        ans=lexicographical(ans,new StringBuilder(s.substring(l,r+1)));
                    }
                }
            }
            if(oneCount==k){
                len=r-l+1;
                if(len<minlen){
                    ans=new StringBuilder(s.substring(l,r+1));
                    minlen=len;
                }
                if(len==minlen){
                        ans=lexicographical(ans,new StringBuilder(s.substring(l,r+1)));
                }
            }
            r++;
        }
        return ans.toString();
    }
    public StringBuilder lexicographical(StringBuilder ans,StringBuilder st){
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)>st.charAt(i)) return st;
            else if(ans.charAt(i)<st.charAt(i)) return ans;
        }
        return ans;
    }
}